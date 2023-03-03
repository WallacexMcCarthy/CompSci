package Vehicles;

import java.awt.*;

abstract public class Vehicle
{

    /**
     * This is the abstract class and methods that will go to their respective classes - car and truck - and access
     * their draw methods.
     * @param g Graphics
     */
    abstract void draw(Graphics g);

    /**
     * This method picks a random vehicle either 1 a car or 0 a truck.
     * @return the random vehicle created
     */
    Vehicle randomVehicle()
    {
        Vehicle randomVehicle;
        int randomNumber;
        randomNumber =(int) (Math.random() * 2);
        if(randomNumber == 0)
        {
           randomVehicle = new Truck();
        }else
        {
            randomVehicle = new Car();
        }
        return randomVehicle;
    }

}
