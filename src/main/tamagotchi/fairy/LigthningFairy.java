package tamagotchi.fairy;

import tamagotchi.Race;
import tamagotchi.type.Type;

public class LigthningFairy extends Fairy{

    public LigthningFairy(String name) {
        super(name, Race.FAIRY, Type.LIGTHNING);
    }
    @Override
    public String joke(int jokeNumber) {
        return null;
    }
    @Override
    public String toString() {
        return null;
    }

    @Override
    public String userPower() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }
}
