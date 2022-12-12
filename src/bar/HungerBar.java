package bar;

public class HungerBar extends Bar {
    public HungerBar() {
        super(115, 115);
    }


    @Override
    public boolean isVital() {
        return (super.getCurrentValue() <= 30);
    }

    @Override
    public String displayBar() {
        int nbChar = super.getMax() / 10;
        int nbFullChar = super.getCurrentValue() / 10;
        StringBuilder barStr = new StringBuilder("Hunger: ");
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