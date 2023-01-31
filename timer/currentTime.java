package timer;

import java.util.Date;

public class currentTime implements timer
{
    private Date now;
    public currentTime() throws InterruptedException {
        System.out.println("The current time is: ");

        printCurrentTime();
    }

    public static void main(String[] args) throws InterruptedException {
        new currentTime();
    }

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
