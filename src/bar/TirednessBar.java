package bar;

public class TirednessBar extends Bar{
    public TirednessBar() {
        super(25, 25);
    }

    @Override
    public boolean isVital() {
        return (super.getCurrentValue() <= 5);
    }

    @Override
    public String displayBar() {
        int nbChar = super.getMax() / 5;
        int nbFullChar = super.getCurrentValue() / 5;
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
