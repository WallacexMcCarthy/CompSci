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
    private final Queue<Point> mouseQueue;
    private boolean isThird;
    public DrawCircle()
    {
        mouseQueue = new LinkedList<>();
        isThird = false;
        this.setSize(500, 500);
        addMouseListener(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
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

    @Override
    public void mouseClicked(MouseEvent e) {
    }

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

            }else
            {
                mouseQueue.offer(getMousePosition());
                pointOne = mouseQueue.remove();
                pointTwo = mouseQueue.remove();
                int radius = (int)(getRadius(pointOne, pointTwo));
                graphics.drawOval((int)(pointOne.getX() - radius), (int)(pointOne.getY() - radius), radius*2, radius*2);
                isThird = true;
            }
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
