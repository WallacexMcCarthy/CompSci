package NumberFormater;

import java.util.HashMap;

/*
This class tact extends NumberFormatter converts any number to any base from 2 to 36 inclusively.
 */

public class BaseFormatter implements NumberFormatter
{
    private final int base;
    public BaseFormatter(int base)
    {
        this.base = base;
    }

    /**
     * This formats the number in base n, where n is any number between 2 and 36 that is provided in the constructor.
     * @param n The integer
     * @return The formatted integer
     */
    @Override
    public String format(int n)
    {
        return Integer.toString(n, base);
    }
}
