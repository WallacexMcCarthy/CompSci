package vehicles;

import java.awt.*;

public class Truck extends Vehicle
{
    private final int x;
    private final int y;
    private final int type;
    /**
     * The Constructor of the Truck class. this initializes all instance variables.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param type the type of position that the car will be in
     */
    Truck(int x, int y, int type)
    {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    /**
     * This method draws the vehicles in the JFrame with the respective type.
     * @param g Graphics | the specified Graphics window
     */
    void draw(Graphics g)
    {
        if(type == 0)
        {
            g.drawRect(x, y, 30, 40);
            g.drawOval(x + 30, y + 10, 10, 10);
            g.drawRect(x - 20, y  + 50, 50, 100);
            g.drawOval(x + 30, y + 60, 10, 10);
            g.drawOval(x + 30, y + 75, 10, 10);
            g.drawOval(x + 30, y + 120, 10, 10);
            g.drawOval(x + 30, y + 135, 10, 10);
        }else if(type == 1)
        {
            g.drawRect(x, y, 100, 50);
            g.drawOval(x + 5, y + 50, 10, 10);
            g.drawOval(x + 20, y + 50, 10, 10);
            g.drawOval(x + 70, y + 50, 10, 10);
            g.drawOval(x + 85, y + 50, 10, 10);
            g.drawRect(x + 105, y + 20, 40, 30);
            g.drawOval(x + 130, y + 50, 10, 10);
        }else
        {
            g.drawRect(x, y, 40, 30);
            g.drawOval(x + 10, y + 30, 10, 10);
            g.drawRect(x + 50, y - 20, 100, 50);
            g.drawOval(x + 60, y + 30, 10, 10);
            g.drawOval(x + 75, y + 30, 10, 10);
            g.drawOval(x + 120, y + 30, 10, 10);
            g.drawOval(x + 135, y + 30, 10, 10);
        }


    }
}
