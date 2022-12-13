import bar.Bar;
import bar.HungerBar;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HungerBarTest {
    private final Bar hungerBar = new HungerBar();

    @Test
    public void currentValueOf20ShouldBeVital() {
        hungerBar.decreaseBar(85); //CurrentValue = 20
        assertTrue(hungerBar.isVital());
    }

    @Test
    public void currentValueOf40ShouldNotBeVital() {
        hungerBar.decreaseBar(65); //CurrentValue = 40
        assertFalse(hungerBar.isVital());
    }

    @Test
    public void nbCharacterDisplayedWithFullBar() {
        int nbFullChar = 0;
        String display = hungerBar.displayBar();
        for(int i = 0; i < display.length(); ++i) {
            if (display.charAt(i) == '#') {
                nbFullChar++;
            }
        }
        assertEquals(nbFullChar, 11);
    }

    @Test
    public void nbCharacterDisplayedWithEmptyBar() {
        hungerBar.decreaseBar(120); //Empty the bar, currentValue = 0
        int nbFullChar = 0;
        String display = hungerBar.displayBar();
        for(int i = 0; i < display.length(); ++i) {
            if (display.charAt(i) == '#') {
                nbFullChar++;
            }
        }
        assertEquals(nbFullChar, 0);
    }

    @Test
    public void nbCharacterDisplayedWithCurrentValue() {
        hungerBar.decreaseBar(30); //currentValue = 85
        int nbFullChar = 0;
        String display = hungerBar.displayBar();
        for(int i = 0; i < display.length(); ++i) {
            if (display.charAt(i) == '#') {
                nbFullChar++;
            }
        }
        assertEquals(nbFullChar, 8);
    }
}
