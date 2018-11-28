import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 175, 55);}

        @Test
        public void canGetAge(){
        assertEquals(18, visitor.getAge());
    }
    @Test
    public void canGetHeight(){
        assertEquals(175, visitor.getHeight());
    }
    @Test
    public void canGetMoney(){
        assertEquals(55, visitor.getMoney());
    }
}
