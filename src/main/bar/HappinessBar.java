package bar;

public class HappinessBar extends Bar{
    public HappinessBar() {
        super(50, 50);
    }

    @Override
    public boolean isVital() {
        return (super.getCurrentValue() <= 20);
    }

    @Override
    public String displayBar() {
        int nbChar = super.getMax() / 5;
        int nbFullChar = super.getCurrentValue() / 5;
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