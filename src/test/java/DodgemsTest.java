import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgem;

    @Before
    public void before(){
        dodgem = new Dodgems("crashy cars");
    }

    @Test
    public void canGetName(){
        assertEquals("crashy cars", dodgem.getName());
    }

}
