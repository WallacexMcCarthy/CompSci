package numberformater;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFormatter
{
    DefaultFormatter defaultFormatter = new DefaultFormatter();
    AccountingFormatter accountingFormatter = new AccountingFormatter();
    DecimalSeparatorFormatter decimalSeparatorFormatter = new DecimalSeparatorFormatter();
    BaseFormatter baseEightFormatter = new BaseFormatter(8);
    BaseFormatter baseSixteenFormatter = new BaseFormatter(16);
    BaseFormatter baseThirtyTwoFormatter = new BaseFormatter(32);
    BaseFormatter negativeBaseFormatter = new BaseFormatter(2);

    // Test the DefaultFormatter

    @Test
    public void testDefaultFormatter()
    {
        Assert.assertEquals("12345", defaultFormatter.format(12345));
    }
    @Test
    public void testZeroDefaultFormatter()
    {
        Assert.assertEquals("0", defaultFormatter.format(0));
    }
    @Test
    public void testNegativeDefaultFormatter()
    {
        Assert.assertEquals("-12345", defaultFormatter.format(-12345));
    }

    // Test the AccountingFormatter
    @Test
    public void testPositiveAccountingFormatter()
    {
        Assert.assertEquals("358", accountingFormatter.format(358));
    }

    @Test
    public void testZeroAccountingFormatter()
    {
        Assert.assertEquals("0", accountingFormatter.format(0));
    }
    @Test
    public void testNegativeZeroAccountingFormatter()
    {
        Assert.assertEquals("0", accountingFormatter.format(-0));
    }


    // Test the DecimalSeparatorFormatter
    @Test
    public void testNegativeAccountingFormatter()
    {
        Assert.assertEquals("(445)", accountingFormatter.format(-445));
    }

    @Test
    public void testZeroDecimalSeparatorFormatter()
    {
        Assert.assertEquals("0", decimalSeparatorFormatter.format(0));
    }
    @Test
    public void testDecimalSeparatorFormatter()
    {
        Assert.assertEquals("123,456,789", decimalSeparatorFormatter.format(123456789));
    }

    // Test the BaseFormatter
    @Test
    public void testBaseEightBaseFormatter()
    {
        Assert.assertEquals("531", baseEightFormatter.format(345));
    }
    @Test
    public void testZeroBaseFormatter()
    {
        Assert.assertEquals("0", baseEightFormatter.format(0));
    }
    @Test
    public void testSixteenBaseFormatter()
    {
        Assert.assertEquals("141da", baseSixteenFormatter.format(82394));
    }
    @Test
    public void testThirtyTwoBaseFormatter()
    {
        Assert.assertEquals("ap", baseThirtyTwoFormatter.format(345));
    }

    @Test
    public void testNegetivebaseFormatter()
    {
        Assert.assertEquals("-11010", negativeBaseFormatter.format(-26));
    }
}
