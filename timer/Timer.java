package timer;

/**
 * Timer interface that has the method printCurrentTime that prints the current time once a second.
 */
public interface Timer {
    void printCurrentTime() throws InterruptedException;
}
