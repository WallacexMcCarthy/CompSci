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

    @Test
    public void testDefaultFormatter()
    {
        Assert.assertEquals("12345", defaultFormatter.format(12345));
    }
    @Test
    public void testPositiveAccountingFormatter()
    {
        Assert.assertEquals("358", accountingFormatter.format(358));
    }
    @Test
    public void testNegativeAccountingFormatter()
    {
        Assert.assertEquals("(445)", accountingFormatter.format(-445));
    }
    @Test
    public void testDecimalSeparatorFormatter()
    {
        Assert.assertEquals("123,456,789", decimalSeparatorFormatter.format(123456789));
    }
    @Test
    public void testBaseEightBaseFormatter()
    {
        Assert.assertEquals("531", baseEightFormatter.format(345));
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
