package src.bar;

public class HungerBar extends Bar {
    public HungerBar() {
        super(115, 155);
    }


    public boolean isVital() {
        return (super.getCurrentValue() <= 30);
    }
}