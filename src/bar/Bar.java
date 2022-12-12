package bar;

public abstract class Bar {
    private static final int max;
    private int currentValue;

    public Bar(int max, int currentValue) {
        this.max = max;
        this.currentValue = currentValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void increaseBar(int val) {
        if (currentValue + val > max) {
            currentValue = max;
        } else {
            currentValue += val;
        }
    }

    /**
     * Returns true if the current value is considered vital (= is under a certain level)
     * @return boolean
     */
    public abstract boolean isVital();

    public abstract String displayBar();

}
