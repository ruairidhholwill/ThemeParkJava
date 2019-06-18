import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(23, 5.70, 10);
    }

    @Test
    public void getAge() {
        assertEquals(23, visitor.getAge());
    }

    @Test
    public void getHeight() {
        assertEquals(5.70, visitor.getHeight(), 0.01);
    }

    @Test
    public void getMoney() {
        assertEquals(10, visitor.getMoney(), 0.01);
    }
}
