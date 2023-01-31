package vehicles;

import java.awt.*;

abstract public class Vehicle
{

    /**
     * This is the abstract class draw that will visually draw the vehicles. The classes Car and Truck have their own
     * version of this method in their respective classes and here this method acts like a directory to the correct
     * vehicle.
     * @param g Graphics | the specified Graphics window
     */
    abstract void draw(Graphics g);

    /**
     * This method creates a random coordinate from 30 to 800.
     * @return a random int in [30, 800] | 770 options
     */
    int randomCoordinate()
    {
        int random;
        random =(int) (Math.random() * 800);
        if(random < 30)
        {
            random = 30;
        }
        return random;
    }

    /**
     * This method creates a random value from 0 to 2 that will be used to choose the position of the truck or car.
     * @return a random int in [0, 2] | 3 options
     */
    int randomType()
    {
        int random;
        random =(int) (Math.random() * 3);

        return random;
    }

    /**
     * This method creates a random value from 0 to 1 that will be used to choose a random vehicle. In addition to
     * this, this method will call randomType() and randomCoordinate() to create a random vehicle.
     * @return the random vehicle created
     */
    Vehicle randomVehicle()
    {
        Vehicle random;
        int randomNum;
        randomNum =(int) (Math.random() * 2);
        if(randomNum == 0)
        {
           random = new Truck(randomCoordinate(), randomCoordinate(), randomType());
        }else
        {
            random = new Car(randomCoordinate(), randomCoordinate(), randomType());
        }

        return random;
    }

}
