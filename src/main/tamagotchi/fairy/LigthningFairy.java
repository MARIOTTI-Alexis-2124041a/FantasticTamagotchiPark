package tamagotchi.fairy;

import tamagotchi.Race;
import tamagotchi.type.Type;

public class LigthningFairy extends Fairy{

    public LigthningFairy(String name) {
        super(name, Race.FAIRY, Type.LIGTHNING);
    }
    @Override
    public String joke(int jokeNumber) {
        switch (jokeNumber) {
            case 1 :
                getHapinessBar().decreaseBar(20); // Type of joke = lovely
                break;
            case 2 :
                getHapinessBar().decreaseBar(50); // Type of joke = kind
                break;
            case 3 :
                getHapinessBar().increaseBar(50); // Type of joke = bad
                break;
            case 4 :
                getHapinessBar().increaseBar(20); // Type of joke = nasty
                break;
        }
        return displayHapinessBar();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  *   _     _  *   * \n");
        sb.append("*    / \\   / \\   *\n");
        sb.append("   * \\  ( )  / \n");
        sb.append("       (| |)\n");
        sb.append("      /_|_|_\\\n");
        return sb.toString();
    }

    @Override
    public String usePower() {
        StringBuilder sb = new StringBuilder();
        sb.append("  *   _     _  *   *    \n");
        sb.append("*    / \\   / \\   *     x  \n");
        sb.append("   * \\  ( )  / _____  xxx\n");
        sb.append("       (| |)   =====    x\n");
        sb.append("      /_|_|_\\          \n");

        /*
        sb.append("      x\n");
        sb.append("     xx\n");
        sb.append("    xxxxxx\n");
        sb.append("       xx\n");
        sb.append("       x  \n");
        */
        return sb.toString();
    }

    public static void main(String args[]) {
        LigthningFairy ligthningFairy = new LigthningFairy("jj");
        System.out.println(ligthningFairy.usePower());
    }
}
