package NumberFormater;

public class DefaultFormatter implements NumberFormatter
{
    /**
     * A DefaultFormatter does nio operations
     * @param n the integer
     * @return the formatted integer
     */
    @Override
    public String format(int n)
    {
        return String.valueOf(n);
    }
}
