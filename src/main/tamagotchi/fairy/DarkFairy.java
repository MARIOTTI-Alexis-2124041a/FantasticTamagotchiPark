package tamagotchi.fairy;

import tamagotchi.Race;
import tamagotchi.type.Type;

public class DarkFairy extends Fairy {

    public DarkFairy(String name) {
        super(name, Race.FAIRY, Type.DARK);

    }

    @Override
    public String joke(int jokeNumber) {
        switch (jokeNumber) {
            case 1 :
                getHapinessBar().decreaseBar(20);
                break;
            case 2 :
                getHapinessBar().increaseBar(50);
                break;
            case 3 :
                getHapinessBar().increaseBar(20);
                break;
            case 4 :
                getHapinessBar().decreaseBar(50);
                break;
        }
        return displayHapinessBar();
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public String usePower() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== x x x x xxxxx\n");
        sb.append("       x\n");
        sb.append("          x\n");
        return sb.toString();
    }
}
