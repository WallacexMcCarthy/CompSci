package NumberFormater;

import java.text.NumberFormat;

public class DecimalSeparatorFormatter implements NumberFormatter
{
    /**
     * A DecimalSeparatorFormatter formats an integer with decimal separators; for example, one million as 1,000,000.
     * @param n the integer
     * @return the formatted integer
     */
    @Override
    public String format(int n)
    {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setGroupingUsed(true);
        return numberFormat.format(n);
    }
}
