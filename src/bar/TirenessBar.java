package bar;

public class TirenessBar extends Bar{
    public TirenessBar() {
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
        StringBuilder barStr = new StringBuilder("Tireness: ");
        for (int i = 0; i <= nbChar; ++i) {
            if (i <= nbFullChar) {
                barStr.append('#');
            } else {
                barStr.append('-');
            }
        }
        return barStr.toString();
    }
}
