import org.junit.Test;
import tamagotchi.Race;
import tamagotchi.fairy.DarkFairy;
import tamagotchi.type.Type;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class DarkFairyTest {
    private DarkFairy darkFairy = new DarkFairy("victoria");

    @Test
    public void testIsFlyingInitial() {
        assertEquals(darkFairy.isFlying(), false);
    }

    @Test
    public void testFlyFirstTime() {
        assertEquals(darkFairy.fly(), "victoria is now flying");
    }

    @Test
    public void testFlySecondTime() {
        darkFairy.fly();
        assertEquals(darkFairy.fly(), "victoria is already flying");
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

    @Test
    public void testName() {
        assertEquals(darkFairy.getName(), "victoria");
    }
    @Test
    public void testDecreaseBar() {
        int happinessBar = darkFairy.getHappinessBar().getCurrentValue();
        darkFairy.joke(1);
        assertEquals(darkFairy.getHappinessBar().getCurrentValue(), happinessBar - 20);
    }

    @Test
    public void testDecreaseBar2() {
        int happinessBar = darkFairy.getHappinessBar().getCurrentValue();
        darkFairy.joke(2);
        assertEquals(darkFairy.getHappinessBar().getCurrentValue(), happinessBar - 30);
    }
    @Test
    public void testIncreaseBar() {
        int happinessBar = darkFairy.getHappinessBar().getCurrentValue();
        darkFairy.joke(3);
        assertEquals(darkFairy.getHappinessBar().getCurrentValue(), happinessBar);
    }

    @Test
    public void testIncreaseBar2() {
        int happinessBar = darkFairy.getHappinessBar().getCurrentValue();
        darkFairy.joke(4);
        assertEquals(darkFairy.getHappinessBar().getCurrentValue(), happinessBar);
    }

    @Test
    public void testComplain() {
        ArrayList<String> listComplain = new ArrayList<>();
        listComplain.add("I tired of living with ligthning fairy... ");
        listComplain.add("I have been hungry for too long !");
        listComplain.add("I am boring...");
        listComplain.add("My wings are to small !!");
        listComplain.add("pfffFFFF");
        assertTrue(listComplain.contains(darkFairy.complain()));
    }
}
