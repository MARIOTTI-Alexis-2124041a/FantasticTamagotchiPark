package bar;

public class HappinessBar extends Bar{
    public HappinessBar() {
        super(50, 50);
    }

    /**
     * Tells if the level of happiness is considered vital, i.e if currentValue < 20
     * @return boolean
     */
    @Override
    public boolean isVital() {
        return (super.getCurrentValue() <= 20);
    }

    /**
     * Give a String representing the current state of the HappinessBar : for instance, Happiness: ###--
     * @return String : The representation of the current state
     */
    @Override
    public String displayBar() {
        int nbChar = super.getMax() / 5; //Total number of chars to display. 5 points = 1 char
        int nbFullChar = super.getCurrentValue() / 5; //Number of '#' to display (= number of points in the bar)
        StringBuilder barStr = new StringBuilder("Happiness: ");
        for (int i = 1; i <= nbChar; ++i) {
            if (i <= nbFullChar) {
                barStr.append('#');
            } else {
                barStr.append('-');
            }
        }
        return barStr.toString();
    }
}