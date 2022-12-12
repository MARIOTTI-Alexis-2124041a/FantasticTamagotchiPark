package tamagotchi.elf;

import tamagotchi.Tamagotchi;

import java.util.ArrayList;
import java.util.List;

public abstract class Elf extends Tamagotchi {
    private final int earSize; //The size of the Elf's ears, between 10 and 20 cm
    private final List<String> retortList;

    public Elf(int earSize) {
        this.earSize = earSize;
        this.retortList = new ArrayList<>();
        retortList.add("Oh! It's just you...");
        retortList.add("You are a very redundant person, that's what kind of person you are.");
    }

    abstract public String joke(int jokeNum);

    public String sillyRetort() {
        int randomRetortNum = (int) (Math.random() * retortList.size());
        return retortList.get(randomRetortNum);
    }

    public String sayHeHasBiggest() {
        return ("I possess the biggest ears in the land. They are no less then " + earSize + " cm long.");
    }

    public abstract String playAnInstrument();
}
