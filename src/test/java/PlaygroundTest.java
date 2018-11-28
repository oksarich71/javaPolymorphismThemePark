import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    @Before
    public void before(){
        playground = new Playground("Funfair");
        visitor = new Visitor(10, 126, 15);
    }
    @Test
    public boolean checkIfAllowedTo(){
        assertEquals(true, playground.isAllowedTo(visitor));
}
}
