import Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Kingda Ka", 1);
        visitor = new Visitor(53, 201, 80);
    }

    @Test
    public void canGetName(){
        assertEquals("Kingda Ka", rollercoaster.getName());
    }

    @Test
    public void defaultPrice() {
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(16.80, rollercoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void isAllowedTo() {
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }
}
