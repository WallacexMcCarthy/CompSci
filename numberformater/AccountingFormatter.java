package numberformater;

public class AccountingFormatter implements  NumberFormatter
{
    /**
     * An AccountingFormatter formats negative numbers with parentheses; for example, –1 as (1).
     * @param n the integer we are operating on.
     * @return the integer n formatted appropriately.
     */
    @Override
    public String format(int n)
    {
        String output;
        if(n < 0)
        {
            output = "(" + Math.abs(n) + ")";
        }else
        {
            output = String.valueOf(n);
        }

        return output;
    }
}
