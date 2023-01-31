package petstore;

import org.testng.Assert;
import org.testng.annotations.Test;

public class petStoreTest
{
    Invoice invoiceOne = new Invoice();
    Invoice invoiceTwo = new Invoice();
    petStoreTest()
    {
        invoiceOne.add(new Item(60, false, 10));
        invoiceOne.add(new Item(20, true, 1));
        invoiceOne.add(new Item(120, false, 4));
        invoiceOne.add(new Item(30, true, 1));

        invoiceTwo.add(new Item(10, false, 1));
        invoiceTwo.add(new Item(5, false, 1));


    }


//    Invoice invoiceTwo = new Invoice(new Item(100, true, 8));


    @Test
    public void testDiscountOne()
    {
        Assert.assertEquals(864.0, invoiceOne.getDiscount());

    }
    @Test
    public void testDiscountTwo()
    {
        Assert.assertEquals(15, invoiceTwo.getDiscount());

    }

}
