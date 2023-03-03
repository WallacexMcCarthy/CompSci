package Vehicles;

import java.awt.*;

public class Truck extends Vehicle
{
    private final int x;
    private final int y;
    public Truck()
    {
        this.x = randomCoordinate();
        this.y = randomCoordinate();
    }
    /**
     * The draw method draws or displays the truck onto the JPanel from the tester class.
     * @param g Graphics
     */
    void draw(Graphics g)
    {
        g.drawRect(x, y, 100, 50);
        g.drawOval(x + 5, y + 50, 10, 10);
        g.drawOval(x + 20, y + 50, 10, 10);
        g.drawOval(x + 70, y + 50, 10, 10);
        g.drawOval(x + 85, y + 50, 10, 10);
        g.drawRect(x + 105, y + 20, 40, 30);
        g.drawOval(x + 130, y + 50, 10, 10);
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
