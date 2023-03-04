package NumberFormater;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFormatter
{
    DefaultFormatter defaultFormatter = new DefaultFormatter();
    AccountingFormatter accountingFormatter = new AccountingFormatter();
    DecimalSeparatorFormatter decimalSeparatorFormatter = new DecimalSeparatorFormatter();
    BaseFormatter baseFormatter = new BaseFormatter(2);
    BaseFormatter baseFormatter1 = new BaseFormatter(32);
    BaseFormatter baseFormatter2 = new BaseFormatter(18);

    @Test
    public void testDefaultFormatter()
    {
        Assert.assertEquals(defaultFormatter.format(10), "10");
        Assert.assertEquals(defaultFormatter.format(-100), "-100");
        Assert.assertEquals(defaultFormatter.format(1234), "1234");
        Assert.assertEquals(defaultFormatter.format(-1234), "-1234");
    }
    @Test
    public void testAccountingFormatter()
    {
        Assert.assertEquals(accountingFormatter.format(10), "10");
        Assert.assertEquals(accountingFormatter.format(-100), "(100)");
        Assert.assertEquals(accountingFormatter.format(1234), "1234");
        Assert.assertEquals(accountingFormatter.format(-1234), "(1234)");
    }
    @Test
    public void testDecimalSeparatorFormatter()
    {
        Assert.assertEquals(decimalSeparatorFormatter.format(10), "10");
        Assert.assertEquals(decimalSeparatorFormatter.format(-100), "-100");
        Assert.assertEquals(decimalSeparatorFormatter.format(1234), "1,234");
        Assert.assertEquals(decimalSeparatorFormatter.format(-1234), "-1,234");
    }
    @Test
    public void testBaseFormatter()
    {
        Assert.assertEquals(baseFormatter.format(10), "1010");
        Assert.assertEquals(baseFormatter.format(-100), "-1100100");
        Assert.assertEquals(baseFormatter.format(1234), "10011010010");
        Assert.assertEquals(baseFormatter.format(-1234), "-10011010010");
        Assert.assertEquals(baseFormatter1.format(10), "A");
        Assert.assertEquals(baseFormatter1.format(-100), "-2C");
        Assert.assertEquals(baseFormatter1.format(1234), "1E2");
        Assert.assertEquals(baseFormatter1.format(-1234), "-1E2");
        Assert.assertEquals(baseFormatter2.format(10), "A");
        Assert.assertEquals(baseFormatter2.format(-100), "-2C");
        Assert.assertEquals(baseFormatter2.format(1234), "1E2");
        Assert.assertEquals(baseFormatter2.format(-1234), "-1E2");
    }

}
