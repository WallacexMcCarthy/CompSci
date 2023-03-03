package Timer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyTimer implements ActionListener
{
    public Timer timer;
    public Date currentDate = new Date();
    private final JFrame frame;
    private final JLabel label;
    public MyTimer()
    {
        // Calls Timer + sets the frame and label.
        timer = new Timer(1000, this);
        timer.start();
        frame = new JFrame();
        frame.setSize(300, 300);
        label = new JLabel();
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(timer.isRunning());
        System.out.println(currentDate);
    }

    public static void main(String[] args)
    {
       new MyTimer();
    }
    // This method is called every time the timer fires and updates the label with the current time.
    @Override
    public void actionPerformed(ActionEvent e) {
        currentDate = new Date();
        label.setText(currentDate.toString());
    }
}
