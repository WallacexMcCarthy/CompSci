package NumberFormater;

public class AccountingFormatter implements NumberFormatter
{
    /**
     * An AccountingFormatter formats negative numbers with parentheses; for example, –1 as (1).
     * @param n the integer
     * @return the formatted integer
     */
    @Override
    public String format(int n)
    {
        String output = String.valueOf(n);
        if(n < 0)
        {
            output = "(" + Math.abs(n) + ")";
        }

        return output;
    }
}
