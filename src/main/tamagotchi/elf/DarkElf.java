package tamagotchi.elf;

import tamagotchi.Race;
import tamagotchi.type.Dark;
import tamagotchi.type.Type;

import java.util.ArrayList;
import java.util.Random;

public class DarkElf extends Elf implements Dark {


    public DarkElf(String name) {
        super(name, Race.ELF, Type.DARK);
    }

    @Override
    public String joke(int jokeNumber) {
        switch (jokeNumber) {
            case 1 :
                getHappinessBar().decreaseBar(20); // Type of joke = lovely
                break;
            case 2 :
                getHappinessBar().decreaseBar(30); // Type of joke = medium
                break;
            case 3 :
                getHappinessBar().increaseBar(20); // Type of joke = not funny
                break;
            case 4 :
                getHappinessBar().increaseBar(30); // Type of joke = nasty
                break;
        }
        return displayHappinessBar();
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
    public String cry() {
        StringBuilder sb = new StringBuilder();
        sb.append("     ~   ___   ~    ~\n");
        sb.append("   ~   \\|   |/ HHhhmm ~   \n");
        sb.append(" ~     ||\\⌒/||     mm mm\n");
        sb.append("       ||  ٥||  ~        mm  m..\n");
        sb.append("           ٥ \n");
        return sb.toString();
    }

    @Override
    public String complain() {
        ArrayList<String> listComplain = new ArrayList<>();
        listComplain.add("I'm tired of living with ligthning elfs... ");
        listComplain.add("I have been hungry for too long !");
        listComplain.add("I am boring");
        return listComplain.get(new Random().nextInt(2));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("     ~   ___     ~\n");
        sb.append("   ~   \\|   |/ ~   ~\n");
        sb.append(" ~     ||\\ /||\n");
        sb.append("       ||   ||   ~\n");
        return sb.toString();
    }

    public static void main(String args[]) {
        DarkElf darkElf = new DarkElf("elf");
        System.out.println(darkElf.playAnInstrument());
        System.out.println(darkElf.toString());
        System.out.println(darkElf.cry());
        System.out.println(darkElf.complain());
    }
}
