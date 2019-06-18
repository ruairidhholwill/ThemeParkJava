import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("tobacco", "fred", 3);
    }

    @Test
    public void canGetName(){
        assertEquals("tobacco", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("fred", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(3, tobaccoStall.getParkingSpot());
    }
}
