package square;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest
{
    Square square = new Square(20, 30, 50);

    // tests the square created by the program
    @Test
    private void getSquare()
    {
        Assert.assertEquals("java.awt.Rectangle[x=20,y=30,width=50,height=50]", square.getSquare().toString());
    }
    // Tests the getArea method
    @Test
    private void testGetArea()
    {
        Assert.assertEquals(2500, square.getArea());
    }
}
