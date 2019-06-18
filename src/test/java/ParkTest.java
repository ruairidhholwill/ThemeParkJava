import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("park");
    }

    @Test
    public void canGetName(){
        assertEquals("park", park.getName());
    }
}
