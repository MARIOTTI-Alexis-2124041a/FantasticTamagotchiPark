import bar.Bar;
import bar.TirednessBar;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TirednessBarTest {
    private final Bar tirednessBar = new TirednessBar();

    @Test
    public void getMaxShouldBe25(){
        assertEquals(tirednessBar.getMax(), 25);
    }
    @Test
    public void currentValueOf25ShouldBeVital() {
        tirednessBar.decreaseBar(85); //CurrentValue = 25
        assertTrue(tirednessBar.isVital());
    }

    @Test
    public void currentValueOf10ShouldNotBeVital() {
        tirednessBar.decreaseBar(10); //CurrentValue = 15
        assertFalse(tirednessBar.isVital());
    }

    @Test
    public void nbCharacterDisplayedWithFullBar() {
        int nbFullChar = 0;
        String display = tirednessBar.displayBar();
        for(int i = 0; i < display.length(); ++i) {
            if (display.charAt(i) == '#') {
                nbFullChar++;
            }
        }
        assertEquals(nbFullChar, 5);
    }

    @Test
    public void nbCharacterDisplayedWithEmptyBar() {
        tirednessBar.decreaseBar(120); //Empty the bar, currentValue = 0
        int nbFullChar = 0;
        String display = tirednessBar.displayBar();
        for(int i = 0; i < display.length(); ++i) {
            if (display.charAt(i) == '#') {
                nbFullChar++;
            }
        }
        assertEquals(nbFullChar, 0);
    }

    @Test
    public void nbCharacterDisplayedWithCurrentValue() {
        tirednessBar.decreaseBar(5); //currentValue = 20
        int nbFullChar = 0;
        String display = tirednessBar.displayBar();
        for(int i = 0; i < display.length(); ++i) {
            if (display.charAt(i) == '#') {
                nbFullChar++;
            }
        }
        assertEquals(nbFullChar, 4);
    }
}
