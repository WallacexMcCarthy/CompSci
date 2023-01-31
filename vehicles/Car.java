package vehicles;

import java.awt.*;

public class Car extends Vehicle
{
    private int x;
    private int y;
    final private int type;

    /**
     * The Constructor of the Car class. this initializes all instance variables.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param type the type of position that the car will be in
     */
    public Car(int x, int y, int type)
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
            g.drawRect(x, y, 20, 40);
            g.drawRect(x + 20, y - 30, 25, 100);
            g.drawOval(x + 45, y - 20, 15, 15);
            g.drawOval(x + 45, y + 45, 15, 15);
        }else if(type == 1)
        {
            this.x = x + 20;
            this.y = y + 20;
            g.drawRect(x, y, 20, 40);
            g.drawRect(x - 25, y - 30, 25, 100);
            g.drawOval(x - 40, y - 20, 15, 15);
            g.drawOval(x - 40, y + 45, 15, 15);
        }else
        {
            g.drawRect(x, y, 40, 20);
            g.drawRect(x - 30, y + 20, 100, 25);
            g.drawOval(x - 20, y + 45, 15, 15);
            g.drawOval(x + 45, y + 45, 15, 15);
        }

    }
}
