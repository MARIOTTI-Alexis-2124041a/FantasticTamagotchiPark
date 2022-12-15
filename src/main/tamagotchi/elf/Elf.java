package tamagotchi.elf;

import tamagotchi.Race;
import tamagotchi.Tamagotchi;
import tamagotchi.type.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Elf extends Tamagotchi {
    /**
     * The size of the Elf's ears, between 10 and 20 cm
     */
    private final int earSize;

    /**
     * List containing the retort used in the sillyRetort() function
     */
    private final List<String> retortList;

    public Elf(String name, Race race, Type type) {
        super(name, race, type);
        this.retortList = new ArrayList<>();
        retortList.add("Oh! It's just you...");
        retortList.add("You are a very redundant person, that's what kind of person you are.");
        this.earSize = new Random().nextInt(20 -10) + 10;
    }

    /**
     * Gives a silly retort chosen randomly in the retortList
     * @return String : The silly retort
     */
    public String sillyRetort() {
        int randomRetortNum = (int) (Math.random() * retortList.size());
        return retortList.get(randomRetortNum);
    }

    /**
     * Gives a string to indicate the great size of the Elf's ears
     * @return String : Containing a sentence and the size of the ears
     */
    public String sayHeHasBiggest() {
        return ("I possess the biggest ears in the land. They are no less then " + earSize + " cm long.");
    }
    public abstract String playAnInstrument();
}
