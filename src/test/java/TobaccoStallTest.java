import Stalls.TobaccoStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("tobacco", "fred", 3, 1);
        visitor = new Visitor(21, 110, 10);
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

    @Test
    public void defaultPrice() {
        assertEquals(6.60, tobaccoStall.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(6.60, tobaccoStall.priceFor(visitor), 0.01);
    }

    @Test
    public void isAllowedTo() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }
}
