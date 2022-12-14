package bar;

public abstract class Bar {
    private final int max; //The maximum value that a bar can reach
    private int currentValue; //The current value of the bar

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

    /**
     * Increase the value (currentValue) of the bar by the value given in parameter
     * Also makes sure that currentValue never goes beyond the max
     * @param val the value to add
     */
    public void increaseBar(int val) {
        if (currentValue + val > max) {
            currentValue = max;
        } else {
            currentValue += val;
        }
    }

    /**
     * Decrease the value (currentValue) of the bar by the value given in parameter
     * Also makes sure that currentValue never goes under zero
     * @param val the value to substract
     */
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
