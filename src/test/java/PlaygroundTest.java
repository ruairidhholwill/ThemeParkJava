import Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("playground", 3);
        visitor = new Visitor(23, 110, 45);
    }

    @Test
    public void canGetName(){
        assertEquals("playground", playground.getName());
    }

    @Test
    public void isAllowedTo() {
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
