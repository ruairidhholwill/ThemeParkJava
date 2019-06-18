import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("candy floss", "candy", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("candy floss", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("candy", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(2, candyFlossStall.getParkingSpot());
    }
}
