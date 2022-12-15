import junit.framework.TestCase;
import org.junit.Test;
import tamagotchi.Race;
import tamagotchi.elf.DarkElf;
import tamagotchi.type.Type;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DarkElfTest {

    private DarkElf darkElf = new DarkElf("Urbain");

    @Test
    public void testType() {
        assertEquals(darkElf.getType(), Type.DARK);
    }

    @Test
    public void testRace() {
        assertEquals(darkElf.getRace(), Race.ELF);
    }

    @Test
    public void testName() {
        assertEquals(darkElf.getName(), "Urbain");
    }

    @Test
    public void testDecreaseBar() {
        int happinessBar = darkElf.getHappinessBar().getCurrentValue();
        darkElf.joke(1);
        TestCase.assertEquals(darkElf.getHappinessBar().getCurrentValue(), happinessBar - 20);
    }

    @Test
    public void testDecreaseBar2() {
        int happinessBar = darkElf.getHappinessBar().getCurrentValue();
        darkElf.joke(2);
        TestCase.assertEquals(darkElf.getHappinessBar().getCurrentValue(), happinessBar - 30);
    }
    @Test
    public void testIncreaseBar() {
        int happinessBar = darkElf.getHappinessBar().getCurrentValue();
        darkElf.joke(3);
        TestCase.assertEquals(darkElf.getHappinessBar().getCurrentValue(), happinessBar);
    }

    @Test
    public void testIncreaseBar2() {
        int happinessBar = darkElf.getHappinessBar().getCurrentValue();
        darkElf.joke(4);
        TestCase.assertEquals(darkElf.getHappinessBar().getCurrentValue(), happinessBar);
    }

    @Test
    public void testComplain() {
        ArrayList<String> listComplain = new ArrayList<>();
        listComplain.add("I'm tired of living with ligthning elfs... ");
        listComplain.add("I have been hungry for too long !");
        listComplain.add("I am boring");
        assertTrue(listComplain.contains(darkElf.complain()));
    }

    @Test
    public void testEarSize(){
        String earSize = darkElf.sayHeHasBiggest().substring(62, darkElf.sayHeHasBiggest().length() - 9);
        System.out.println(darkElf.sayHeHasBiggest());
        assertTrue(10 <= Integer.parseInt(earSize) && Integer.parseInt(earSize) <= 20);
    }

    @Test
    public void testSayHeHasBiggest() {
        assertEquals(darkElf.sayHeHasBiggest().substring(0,61), "I possess the biggest ears in the land. They are no less then");
        assertEquals(darkElf.sayHeHasBiggest().substring(darkElf.sayHeHasBiggest().length()-8), "cm long.");
    }

    @Test
    public void testSillyRetort() {
        ArrayList<String> retortList = new ArrayList<>();
        retortList.add("Oh! It's just you...");
        retortList.add("You are a very redundant person, that's what kind of person you are.");
        assertTrue(retortList.contains(darkElf.sillyRetort()));
    }
}
