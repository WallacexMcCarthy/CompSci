package Vehicles;

import java.awt.*;

public class Car extends Vehicle
{
    private int x;
    private int y;
    public Car()
    {
        this.x = randomCoordinate();
        this.y = randomCoordinate();
    }

    /**
     * This method draws the car onto the JFrame.
     * @param g Graphics
     */
    void draw(Graphics g)
    {
        g.drawRect(x, y, 40, 20);
        g.drawRect(x - 30, y + 20, 100, 25);
        g.drawOval(x - 20, y + 45, 15, 15);
        g.drawOval(x + 45, y + 45, 15, 15);
    }
    /**
     * This method creates a random coordinate from 30 to 600.
     * @return a random int in [30, 600]
     */
    int randomCoordinate()
    {
        int random;
        random =(int) (Math.random() * 600);
        if(random < 30)
        {
            random = 30;
        }
        return random;
    }
}
