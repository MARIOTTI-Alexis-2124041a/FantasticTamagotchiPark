import bar.Bar;
import bar.HappinessBar;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HappinessBarTest {
    private final Bar happinessBar = new HappinessBar();

    @Test
    public void getMaxShouldBe50(){
        assertEquals(happinessBar.getMax(), 50);
    }
    @Test
    public void currentValueOf20ShouldBeVital() {
        happinessBar.decreaseBar(85); //CurrentValue = 20
        assertTrue(happinessBar.isVital());
    }

    @Test
    public void currentValueOf40ShouldNotBeVital() {
        happinessBar.decreaseBar(10); //CurrentValue = 40
        assertFalse(happinessBar.isVital());
    }

    @Test
    public void nbCharacterDisplayedWithFullBar() {
        int nbFullChar = 0;
        String display = happinessBar.displayBar();
        for(int i = 0; i < display.length(); ++i) {
            if (display.charAt(i) == '#') {
                nbFullChar++;
            }
        }
        assertEquals(nbFullChar, 10);
    }

    @Test
    public void nbCharacterDisplayedWithEmptyBar() {
        happinessBar.decreaseBar(120); //Empty the bar, currentValue = 0
        int nbFullChar = 0;
        String display = happinessBar.displayBar();
        for(int i = 0; i < display.length(); ++i) {
            if (display.charAt(i) == '#') {
                nbFullChar++;
            }
        }
        assertEquals(nbFullChar, 0);
    }

    @Test
    public void nbCharacterDisplayedWithCurrentValue() {
        happinessBar.decreaseBar(30); //currentValue = 20
        int nbFullChar = 0;
        String display = happinessBar.displayBar();
        for(int i = 0; i < display.length(); ++i) {
            if (display.charAt(i) == '#') {
                nbFullChar++;
            }
        }
        assertEquals(nbFullChar, 4);
    }
}
