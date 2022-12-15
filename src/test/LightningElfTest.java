import junit.framework.TestCase;
import org.junit.Test;
import tamagotchi.Race;
import tamagotchi.elf.LightningElf;
import tamagotchi.type.Type;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LightningElfTest {
    private LightningElf lightningElf = new LightningElf("myLightningElf");

    @Test
    public void testType() {
        assertEquals(lightningElf.getType(), Type.LIGHTNING);
    }

    @Test
    public void testRace() {
        assertEquals(lightningElf.getRace(), Race.ELF);
    }

    @Test
    public void testName() {
        assertEquals(lightningElf.getName(), "myLightningElf");
    }

    @Test
    public void testDecreaseBar() {
        int happinessBar = lightningElf.getHappinessBar().getCurrentValue();
        lightningElf.joke(3);
        TestCase.assertEquals(lightningElf.getHappinessBar().getCurrentValue(), happinessBar - 20);
    }

    @Test
    public void testDecreaseBar2() {
        int happinessBar = lightningElf.getHappinessBar().getCurrentValue();
        lightningElf.joke(4);
        TestCase.assertEquals(lightningElf.getHappinessBar().getCurrentValue(), happinessBar - 30);
    }
    @Test
    public void testIncreaseBar() {
        int happinessBar = lightningElf.getHappinessBar().getCurrentValue();
        lightningElf.joke(1);
        TestCase.assertEquals(lightningElf.getHappinessBar().getCurrentValue(), happinessBar);
    }

    @Test
    public void testIncreaseBar2() {
        int happinessBar = lightningElf.getHappinessBar().getCurrentValue();
        lightningElf.joke(2);
        TestCase.assertEquals(lightningElf.getHappinessBar().getCurrentValue(), happinessBar);
    }

    @Test
    public void testCompliments() {
        ArrayList<String> listCompliments = new ArrayList<>();
        listCompliments.add("I am so happy to be in you ♡");
        listCompliments.add("I like talking with you");
        listCompliments.add("You are so beautiful");
        listCompliments.add("Ohh who is this amazing person front of me");
        assertTrue(listCompliments.contains(lightningElf.compliment()));
    }
    @Test
    public void testEarSize(){
        String earSize = lightningElf.sayHeHasBiggest().substring(62, lightningElf.sayHeHasBiggest().length() - 9);
        System.out.println(lightningElf.sayHeHasBiggest());
        assertTrue(10 <= Integer.parseInt(earSize) && Integer.parseInt(earSize) <= 20);
    }

    @Test
    public void testSayHeHasBiggest() {
        assertEquals(lightningElf.sayHeHasBiggest().substring(0,61), "I possess the biggest ears in the land. They are no less then");
        assertEquals(lightningElf.sayHeHasBiggest().substring(lightningElf.sayHeHasBiggest().length()-8), "cm long.");
    }

    @Test
    public void testSillyRetort() {
        ArrayList<String> retortList = new ArrayList<>();
        retortList.add("Oh! It's just you...");
        retortList.add("You are a very redundant person, that's what kind of person you are.");
        assertTrue(retortList.contains(lightningElf.sillyRetort()));
    }
}
