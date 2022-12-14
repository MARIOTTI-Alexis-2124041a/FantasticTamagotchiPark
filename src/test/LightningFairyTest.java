import org.junit.Test;
import tamagotchi.Race;
import tamagotchi.fairy.LigthningFairy;
import tamagotchi.type.Type;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class LightningFairyTest {

    private LigthningFairy lightningFairy = new LigthningFairy("Loue");

    @Test
    public void testIsFlyingInitial() {
        assertEquals(lightningFairy.isFlying(), false);
    }

    @Test
    public void testFlyFirstTime() {
        assertEquals(lightningFairy.fly(), "Loue is now flying");
    }

    @Test
    public void testFlySecondTime() {
        lightningFairy.fly();
        assertEquals(lightningFairy.fly(), "Loue is already flying");
    }

    @Test
    public void testWingsSize() {
        assertTrue(5 <= lightningFairy.getWingsSize() && lightningFairy.getWingsSize() <= 15);
    }

    @Test
    public void testType() {
        assertEquals(lightningFairy.getType(), Type.LIGHTNING);
    }

    @Test
    public void testRace() {
        assertEquals(lightningFairy.getRace(), Race.FAIRY);
    }

    @Test
    public void testDecreaseBar() {
        int happinessBar = lightningFairy.getHappinessBar().getCurrentValue();
        lightningFairy.joke(3);
        assertEquals(lightningFairy.getHappinessBar().getCurrentValue(), happinessBar - 20);
    }

    @Test
    public void testDecreaseBar2() {
        int happinessBar = lightningFairy.getHappinessBar().getCurrentValue();
        lightningFairy.joke(4);
        assertEquals(lightningFairy.getHappinessBar().getCurrentValue(), happinessBar - 30);
    }
    @Test
    public void testIncreaseBar() {
        int happinessBar = lightningFairy.getHappinessBar().getCurrentValue();
        lightningFairy.joke(1);
        assertEquals(lightningFairy.getHappinessBar().getCurrentValue(), happinessBar);
    }

    @Test
    public void testIncreaseBar2() {
        int happinessBar = lightningFairy.getHappinessBar().getCurrentValue();
        lightningFairy.joke(2);
        assertEquals(lightningFairy.getHappinessBar().getCurrentValue(), happinessBar);
    }

    @Test
    public void testCompliments() {
        ArrayList<String> listCompliments= new ArrayList<>();
        listCompliments.add("You are so beautiful");
        listCompliments.add("Ohh you are so kind ♡");
        listCompliments.add("I am so happy to talk with you !");
        listCompliments.add("Ohh you change something ? You are amazing");
        assertTrue(listCompliments.contains(lightningFairy.compliment()));
    }
}
