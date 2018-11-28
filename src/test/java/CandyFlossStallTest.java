import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    CandyFlossStall candyFlossStall;
    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy Treats", "Susie Bee", "Entrance");
    }
    @Test
    public void canGetName(){
        assertEquals("Candy Treats", candyFlossStall.getName());
    }
    @Test
    public void canGetOwnerName(){
        assertEquals("Susie Bee", candyFlossStall.getOwnerName());
    }
    @Test
    public void canGetParkingSpot(){
        assertEquals("Entrance", candyFlossStall.getParkingSpot());
    }
}
