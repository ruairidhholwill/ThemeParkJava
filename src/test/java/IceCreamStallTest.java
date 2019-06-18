import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("ice cream", "ice person", 1);
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
}
