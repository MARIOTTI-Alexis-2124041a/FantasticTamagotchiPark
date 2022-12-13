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
                getHapinessBar().decreaseBar(20); // Type of joke = lovely
                break;
            case 2 :
                getHapinessBar().decreaseBar(50); // Type of joke = medium
                break;
            case 3 :
                getHapinessBar().increaseBar(20); // Type of joke = not funny
                break;
            case 4 :
                getHapinessBar().increaseBar(50); // Type of joke = nasty
                break;
        }
        return displayHapinessBar();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ~   _     _  ~   ~ \n");
        sb.append("~    / \\   / \\   ~\n");
        sb.append("   ~ \\  ( )  / \n");
        sb.append("       (| |)\n");
        sb.append("      /_|_|_\\\n");
        return sb.toString();
    }

    @Override
    public String usePower() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ~   _     _  ~   ~ \n");
        sb.append("~    / \\   / \\   ~\n");
        sb.append("   ~ \\  ( )  / _____ /|\\ /|\\ \n");
        sb.append("       (| |)   ===== \\|/ \\|/ \n");
        sb.append("      /_|_|_\\\n");
        return sb.toString();
    }

    public static void main(String args[]) {
        DarkFairy darkFairy = new DarkFairy("jj");
        System.out.println(darkFairy.toString());
    }
}
