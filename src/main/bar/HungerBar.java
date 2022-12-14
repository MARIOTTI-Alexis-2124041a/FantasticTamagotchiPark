package bar;

public class HungerBar extends Bar {
    public HungerBar() {
        super(115, 115);
    }

    /**
     * Tells if the hunger level is considered vital, i.e if it currentValue < 30
     * @return boolean
     */
    @Override
    public boolean isVital() {
        return (super.getCurrentValue() <= 30);
    }

    /**
     * Give a String representing the current state of the HungerBar : for instance, Hunger: ###--
     * @return String : The representation of the current state
     */
    @Override
    public String displayBar() {
        int nbChar = super.getMax() / 10; //Total number of chars to display. 10 points = 1 char
        int nbFullChar = super.getCurrentValue() / 10; //Number of '#' to display (= number of points in the bar)
        StringBuilder barStr = new StringBuilder("Hunger: ");
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