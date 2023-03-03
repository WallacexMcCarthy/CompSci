package Vehicles;

import javax.swing.*;
import java.awt.*;

public class Tester extends JFrame
{
    private final Vehicle vehicle = new Vehicle() {
        @Override
        void draw(Graphics g) {}
    };
    public Tester()
    {
        setTitle("Vehicles");
        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * Paints 15 vehicles onto the jFanel.
     * @param g the specified Graphics window
     */
    public void paint(Graphics g)
    {
        super.paint(g);
        for(int index = 0; index < 15; index++)
        {
            vehicle.randomVehicle().draw(g);
        }
    }

    public static void main(String[] args) {
        new Tester();
    }

}
