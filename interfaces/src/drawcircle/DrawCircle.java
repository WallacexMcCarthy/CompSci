package drawcircle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Queue;

public class DrawCircle extends JFrame implements MouseListener
{
    private Point pointOne;
    private Point pointTwo;
    // A queue is used to store the points of the mouse clicks
    private final Queue<Point> mouseQueue;
    private boolean isThird;
    // This is the constructor for the DrawCircle class which will create a JFrame and add a MouseListener to it with
    // the size of 500x500.
    public DrawCircle()
    {
        mouseQueue = new LinkedList<>();
        isThird = false;
        this.setSize(500, 500);
        addMouseListener(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * This method will calculate the radius of a circle given two points
     * @param pointOne - the first point
     * @param pointTwo - the second point
     * @return - the radius of the circle
     */
    private double getRadius(Point pointOne, Point pointTwo)
    {
        double xOne = pointOne.getX();
        double yOne = pointOne.getY();
        double xTwo = pointTwo.getX();
        double yTwo = pointTwo.getY();

        double triangleX = Math.abs(xOne - xTwo);
        double triangleY = Math.abs(yOne - yTwo);
        triangleX = triangleX*triangleX;
        triangleY = triangleY*triangleY;
        double radius = triangleX + triangleY;
        radius = Math.sqrt(radius);
        return radius;
    }

    public static void main(String[] args) {
        new DrawCircle();
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     * This method will draw a circle on the screen with the first click as the center and the second click as the
     * radius which is on the perimeter of the circle.
     * This method uses a queue to store the points of the mouse clicks. I used a queue because it is a
     * first in first out collection type and I have never used it before.
     * @param e the event that will be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {
        Graphics graphics = getGraphics();
        if(isThird)
        {
            repaint();
            isThird = false;
        }else
        {
            if(mouseQueue.size() < 1)
            {
                mouseQueue.offer(getMousePosition());
                graphics.drawOval((int)(getMousePosition().getX()), (int)(getMousePosition().getY()), 1, 1);

            }else
            {
                mouseQueue.offer(getMousePosition());
                pointOne = mouseQueue.poll();
                pointTwo = mouseQueue.poll();
                int radius = (int)(getRadius(pointOne, pointTwo));
                graphics.drawOval((int)(pointOne.getX() - radius), (int)(pointOne.getY() - radius), radius*2, radius*2);
                isThird = true;
            }
        }



    }


    // These methods are not used but are required to implement MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
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
