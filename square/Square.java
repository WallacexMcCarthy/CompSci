package square;

import org.w3c.dom.css.Rect;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Square extends Rectangle
{

    private int side = 0;
    private int locationX;
    private int locationY;
    private Rectangle rectangle;

    /**
     * This class extends the Rectangle class. in this constructor there are variables that are used to set the
     * location, and side lengths of the square.
     * @param locationX the x coordinate of the top left corner of the square.
     * @param locationY the y coordinate of the top left corner of the square.
     * @param side the side length of the square.
     */
    public Square(int locationX, int locationY, int side)
    {
        this.rectangle = new Rectangle(0,0,0,0);
        this.side = side;
        this.locationX = locationX;
        this.locationY = locationY;
        setSize();
        setLocation();
    }

    /**
     * Computes the area of the square
     * @return the area of the square
     */
    public int getArea()
    {
        int area = side * side;
        return area;
    }
    public void setSize()
    {
        rectangle.setSize(side, side);
    }
    public void setLocation()
    {
        rectangle.setLocation(locationX - side/2, locationY - side/2);
    }
    /**
     * Retrieves the rectangle created by the constructor.
     * @return the Square
     */
    public Rectangle getSquare()
    {
        return rectangle;
    }
}
