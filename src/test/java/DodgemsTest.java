import Attractions.Dodgems;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgem;
    Visitor visitor;

    @Before
    public void before(){
        dodgem = new Dodgems("crashy cars", 4);
        visitor = new Visitor(8, 120, 10);
    }

    @Test
    public void canGetName(){
        assertEquals("crashy cars", dodgem.getName());
    }

    @Test
    public void defaultPrice() {
        assertEquals(4.50, dodgem.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(2.25, dodgem.priceFor(visitor), 0.01);
    }
}
