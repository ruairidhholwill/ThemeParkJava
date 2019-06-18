import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Kingda Ka");
    }

    @Test
    public void canGetName(){
        rollercoaster.getName();
    }
}
