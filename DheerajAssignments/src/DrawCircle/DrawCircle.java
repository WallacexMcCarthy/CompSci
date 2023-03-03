package DrawCircle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawCircle extends JFrame implements MouseListener
{
    private Point pointOne;
    private Point pointTwo;
    private int count = 0;
    public DrawCircle()
    {
        // Sets the frame and attaches the mouse listener.
        setSize(800, 800);
        addMouseListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Gets the radius of the circle.
     * @param pointOne the first point
     * @param pointTwo the second point
     * @return the radius of the circle
     */
    private double getRadius(Point pointOne, Point pointTwo)
    {
        double x = pointOne.getX();
        double y = pointOne.getY();
        double v = pointTwo.getX();
        double z = pointTwo.getY();

        double lenOne = Math.abs(x - v);
        double lenTwo = Math.abs(y - z);
        lenOne = lenOne*lenOne;
        lenTwo = lenTwo*lenTwo;
        double radius = lenOne + lenTwo;
        radius = Math.sqrt(radius);
        return radius;
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    public static void main(String[] args) {
        new DrawCircle();
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {
        Graphics g = getGraphics();
        // This is the third click, and it will clear the screen
        if(count == 2)
        {
            g.clearRect(0, 0, 800, 800);
            count = 0;
        }
        // This is the first click, and it will set the first point
        else if (count == 0)
        {
            pointOne = getMousePosition();
            count++;
        }
        // This is the second click, and it will draw the circle
        else if(count == 1)
        {
            pointTwo = getMousePosition();
            int radius = (int)(getRadius(pointOne, pointTwo));
            g.drawOval((int)(pointOne.getX() - radius), (int)(pointOne.getY() - radius), radius*2, radius*2);
            count++;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
