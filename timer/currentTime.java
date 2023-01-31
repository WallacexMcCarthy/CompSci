package timer;

import java.util.Date;

// Implements the interface Timer and its one method printCurrentTime
public class currentTime implements Timer
{
    private Date now;

    /**
     * Constructor calls the method - printCurrentTime - and prints "The current time is: ".
     * @throws InterruptedException if the Thread.sleep is interrupted then it will throw an exception.
     */
    public currentTime() throws InterruptedException {
        System.out.println("The current time is: ");

        printCurrentTime();
    }

    /**
     * the start method
     * @param args
     * @throws InterruptedException if the Thread.sleep is interrupted then it will throw an exception.
     */
    public static void main(String[] args) throws InterruptedException {
        new currentTime();
    }

    /**
     * This is the method grabbed from the interface. this method prints the current time once a second.
     * @throws InterruptedException if the Thread.sleep is interrupted then it will throw an exception.
     */
    @Override
    public void printCurrentTime() throws InterruptedException {
        while(true)
        {
            now  = new Date();
            System.out.println(now);
            Thread.sleep(1000);
        }
    }
}
