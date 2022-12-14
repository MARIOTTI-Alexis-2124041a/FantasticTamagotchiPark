package tamagotchi.elf;

import tamagotchi.Race;
import tamagotchi.type.Type;

public class LigthningElf extends Elf {

    public LigthningElf(String name) {
        super(name, Race.ELF, Type.LIGTHNING);
    }
    @Override
    public String joke(int jokeNum) {
        switch (jokeNum) {
            case 1 :
                getHapinessBar().increaseBar(30); // Type of joke = lovely
                break;
            case 2 :
                getHapinessBar().increaseBar(40); // Type of joke = kind
                break;
            case 3 :
                getHapinessBar().decreaseBar(20); // Type of joke = bad
                break;
            case 4 :
                getHapinessBar().decreaseBar(30); // Type of joke = nasty
                break;
        }
        return displayHapinessBar();
    }

    @Override
    public String playAnInstrument() {
        StringBuilder sb = new StringBuilder();
        sb.append("                     /|\n");
        sb.append("       =  =  =      / |\n");
        sb.append("  ____| || || |____/  | -_-_-_-_-_-_\n");
        sb.append("|)----| || || |____   |     Oh Happy, happy\n");
        sb.append("  ((  | || || |  ))\\  | _-_-_-_-_-_-\n");
        sb.append("   \\\\_|_||_||_|_//  \\ |\n");
        sb.append("    \\___________/    \\|");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("     *   ---     *\n");
        sb.append(" *     \\|   |/ *   *\n");
        sb.append("    *  ||\\◡/||\n");
        sb.append("  *    ||   ||   *\n");
        return sb.toString();
    }

    public static void main(String args[]) {
        LigthningElf ligthningElf = new LigthningElf("elf");
        System.out.println(ligthningElf.playAnInstrument());
        System.out.println(ligthningElf.toString());
    }
}
