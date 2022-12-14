package tamagotchi.elf;

import tamagotchi.Race;
import tamagotchi.fairy.DarkFairy;
import tamagotchi.type.Type;

import java.util.Random;

public class DarkElf extends Elf {


    public DarkElf(String name) {
        super(name, Race.ELF, Type.DARK);
    }

    @Override
    public String joke(int jokeNumber) {
        switch (jokeNumber) {
            case 1 :
                getHapinessBar().decreaseBar(20); // Type of joke = lovely
                break;
            case 2 :
                getHapinessBar().decreaseBar(30); // Type of joke = medium
                break;
            case 3 :
                getHapinessBar().increaseBar(20); // Type of joke = not funny
                break;
            case 4 :
                getHapinessBar().increaseBar(30); // Type of joke = nasty
                break;
        }
        return displayHapinessBar();
    }

    @Override
    public String playAnInstrument() {
        StringBuilder sb = new StringBuilder();
        sb.append("     _\n");
        sb.append("    / 7\n");
        sb.append("   /_(\n");
        sb.append("   |_|\n");
        sb.append("   |_|        |\\ \n");
        sb.append("   |_| /\\    x|     |\\ \n");
        sb.append(" /\\|=|/ /          x|              way,yeah ! \n");
        sb.append(" \\ |_| /        |\\              in the \n");
        sb.append("  ) _  \\       x|           Something \n");
        sb.append(" / |_|  \\          in the way,mmm\n");
        sb.append("/  -=-o /   Something\n");
        sb.append("\\  /~\\_/  \n");
        sb.append(" \\/");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("     ~   ---     ~\n");
        sb.append("   ~   \\|   |/ ~   ~\n");
        sb.append(" ~     ||\\ /||\n");
        sb.append("       ||   ||   ~\n");
        return sb.toString();
    }

    public static void main(String args[]) {
        DarkElf darkElf = new DarkElf("elf");
        System.out.println(darkElf.playAnInstrument());
        System.out.println(darkElf.toString());
    }
}
