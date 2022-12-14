package bar;

public class TirednessBar extends Bar{
    public TirednessBar() {
        super(25, 25);
    }

    /**
     * Tells if the level of tiredness is considered vital, i.e if it currentValue < 5
     * @return boolean
     */
    @Override
    public boolean isVital() {
        return (super.getCurrentValue() <= 5);
    }

    /**
     * Give a String representing the current state of the TirednessBar : for instance, Tiredness: ###--
     * @return String : the representation of the current state
     */
    @Override
    public String displayBar() {
        int nbChar = super.getMax() / 5; //Total number of chars to display. 10 points = 1 char
        int nbFullChar = super.getCurrentValue() / 5; //Number of '#' to display (= number of points in the bar)
        StringBuilder barStr = new StringBuilder("Tiredness: ");
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
