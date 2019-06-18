import org.junit.Before;
import org.junit.Test;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("playground");
    }

    @Test
    public void canGetName(){
        playground.getName();
    }
}
