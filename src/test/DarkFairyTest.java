import org.junit.Test;
import tamagotchi.Race;
import tamagotchi.fairy.DarkFairy;
import tamagotchi.type.Type;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class DarkFairyTest {
    private DarkFairy darkFairy = new DarkFairy("victoria");

    @Test
    public void testIsFlyingInitial() {
        assertEquals(darkFairy.isFlying(), false);
    }

    @Test
    public void testFlyFistTime() {
        assertEquals(darkFairy.fly(), "The fairy is flying");
    }

    @Test
    public void testFlySecondTime() {
        darkFairy.fly();
        assertEquals(darkFairy.fly(), "The fairy is already flying");
    }

    @Test
    public void testWingsSize() {
        assertTrue(5 <= darkFairy.getWingsSize() && darkFairy.getWingsSize() <= 15);
    }

    @Test
    public void testType() {
        assertEquals(darkFairy.getType(), Type.DARK);
    }

    @Test
    public void testRace() {
        assertEquals(darkFairy.getRace(), Race.FAIRY);
    }
}
