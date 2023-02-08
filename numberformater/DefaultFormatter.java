package numberformater;

public class DefaultFormatter implements NumberFormatter
{
    /**
     * A DefaultFormatter just converts the integer from a regular integer to a string. no real changes.
     * @param n the int n that we are operating on.
     * @return the integer n formatted correctly.
     */
    @Override
    public String format(int n)
    {
        String output = String.valueOf(n);
        return output;
    }
}
