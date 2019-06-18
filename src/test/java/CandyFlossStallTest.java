import Stalls.CandyFlossStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;
    Visitor visitor;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("candy floss", "candy", 2, 5);
        visitor = new Visitor(21, 110, 10);
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

    @Test
    public void defaultPrice() {
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(4.20, candyFlossStall.priceFor(visitor), 0.01);
    }
}
