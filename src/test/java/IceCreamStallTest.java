import Stalls.IceCreamStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("ice cream", "ice person", 1, 3);
        visitor = new Visitor(21, 110, 10);
    }

    @Test
    public void canGetName(){
        assertEquals("ice cream", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("ice person", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(1, iceCreamStall.getParkingSpot());
    }

    @Test
    public void defaultPrice() {
        assertEquals(2.80, iceCreamStall.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(2.80, iceCreamStall.priceFor(visitor), 0.01);
    }
}

