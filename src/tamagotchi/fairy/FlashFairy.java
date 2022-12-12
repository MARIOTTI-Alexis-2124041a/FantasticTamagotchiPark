package tamagotchi.fairy;

import bar.Bar;
import tamagotchi.Race;
import tamagotchi.type.Type;

public class FlashFairy extends Fairy{


    public FlashFairy(String name, Race race, Type type) {
        super(name, race, type);
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
