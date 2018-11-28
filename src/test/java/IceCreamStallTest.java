import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;
    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Sweet Treats", "Ian Dunn", "Grass area");
    }
    @Test
    public void canGetName(){
        assertEquals("Sweet Treats", iceCreamStall.getName());
    }
    @Test
    public void canGetOwnerName(){
        assertEquals("Ian Dunn", iceCreamStall.getOwnerName());
    }
    @Test
    public void canGetParkingSpot(){
        assertEquals("Grass area", iceCreamStall.getParkingSpot());
    }
}
