package bar;

public abstract class Bar {
    private final int max;
    private int currentValue;

    public Bar(int max, int currentValue) {
        this.max = max;
        this.currentValue = currentValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getMax() {
        return max;
    }

    public void increaseBar(int val) {
        if (currentValue + val > max) {
            currentValue = max;
        } else {
            currentValue += val;
        }
    }

    public void decreaseBar(int val) {
        if (currentValue - val < 0) {
            currentValue = 0;
        } else {
            currentValue -= val;
        }

    }

    /**
     * Returns true if the current value is considered vital (= is under a certain level)
     * @return boolean
     */
    public abstract boolean isVital();

    public abstract String displayBar();

}
