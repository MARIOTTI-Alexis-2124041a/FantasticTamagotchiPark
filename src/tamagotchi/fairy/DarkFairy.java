package tamagotchi.fairy;

import bar.Bar;
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

        }
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    void userPower() {

    }
}
