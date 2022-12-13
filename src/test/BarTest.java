import bar.Bar;
import bar.HungerBar;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarTest {
    private Bar bar = new HungerBar();

    @Test
    public void testDecreaseBar() {
        bar.decreaseBar(10);
        assertEquals(bar.getCurrentValue(), 105);
    }

    @Test
    public void currentValueShouldNotGoUnderZero() {
        bar.decreaseBar(200);
        assertEquals(bar.getCurrentValue(), 0);
    }

    @Test
    public void testIncreaseBar() {
        bar.decreaseBar(115); //Current value = 0
        bar.increaseBar(30);
        assertEquals(bar.getCurrentValue(), 30);
    }
}
