package extracredit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BuildGUI extends Component implements MouseListener
{
    private final JButton button, noButton;
    private final JPanel panel, endPanel;
    private JFrame frame, endFrame;
    private final JLabel label, finalLabel;
    public BuildGUI()
    {
        frame = new JFrame();
        frame.setTitle("Impossible Clicker");
        frame.setSize(800,800);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(800,800);
        panel.setBackground(Color.WHITE);
        endPanel = new JPanel();
        endPanel.setLayout(null);
        endPanel.setSize(800,800);
        endPanel.setBackground(Color.CYAN);
        label = new JLabel("Do you like money??? Click the button ot get some!");
        label.setBounds(230, 300, 340, 30);
        finalLabel = new JLabel("You dont want any money?? Lame!!");
        finalLabel.setBounds(230, 300, 340, 30);
        button = new JButton("Yes");
        button.setBounds(350, 350, 100, 30);
        button.setBackground(Color.ORANGE);
        noButton = new JButton("No");
        noButton.setBounds(350, 390, 100, 30);
        noButton.setBackground(Color.ORANGE);
        endPanel.add(finalLabel);
        panel.add(noButton);
        // This line will make the button go to a random place when the cursor hits the boarder.
        button.addMouseListener(this);
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endFrame = new JFrame();
                endFrame.setSize(800, 800);
                endFrame.add(endPanel);
                endFrame.setVisible(true);
                frame.dispose();
                endFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        panel.add(label);
        panel.add(button);
        panel.setVisible(true);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method will give a random coordinate in the range of (0, 700)
     * @return the random coordinate
     */
    private static int randomCoordinate() { return (int)(Math.random()*701); }
    /**
     * When the cursor hits the boarder of the button it will move the button to a random place.
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(final MouseEvent e) { button.move(randomCoordinate(), randomCoordinate()); }
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
