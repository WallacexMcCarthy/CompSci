package numberformater;

import java.text.NumberFormat;

public class DecimalSeparatorFormatter implements NumberFormatter
{
    /**
     * A DecimalSeparatorFormatter formats an integer with decimal separators; for example, one million as 1,000,000.
     * Note there is not a floating point at the end of this int.
     * @param n the int n that we are operating on.
     * @return the integer n formatted correctly.
     */
    @Override
    public String format(int n)
    {
        String out = "";
        System.out.println();
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setGroupingUsed(true);
        out = numberFormat.format(n);
        return out;
    }
}
