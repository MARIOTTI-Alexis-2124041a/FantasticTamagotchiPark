package tamagotchi.elf;

import tamagotchi.Race;
import tamagotchi.type.Lightning;
import tamagotchi.type.Type;

import java.util.ArrayList;
import java.util.Random;

public class LigthningElf extends Elf implements Lightning {

    public LigthningElf(String name) {
        super(name, Race.ELF, Type.LIGHTNING);
    }

    /**
     * Change the happiness bar of ligthning elf depending on the joke
     * @param jokeNum
     * @return String : the happiness bar
     */
    @Override
    public String joke(int jokeNum) {
        switch (jokeNum) {
            case 1 :
                getHappinessBar().increaseBar(30); // Type of joke = lovely
                break;
            case 2 :
                getHappinessBar().increaseBar(40); // Type of joke = kind
                break;
            case 3 :
                getHappinessBar().decreaseBar(20); // Type of joke = bad
                break;
            case 4 :
                getHappinessBar().decreaseBar(30); // Type of joke = nasty
                break;
        }
        return displayHappinessBar();
    }

    /**
     * Create a string of the ligthning elf playing an instrument
     * @return String
     */
    @Override
    public String playAnInstrument() {
        StringBuilder sb = new StringBuilder();
        sb.append("                     /|\n");
        sb.append("       =  =  =      / |\n");
        sb.append("  ____| || || |____/  | -_-_-_-_-_-_\n");
        sb.append("|)----| || || |____   |     Tu tu tu tu, tuuu tuu\n");
        sb.append("  ((  | || || |  ))\\  | _-_-_-_-_-_-\n");
        sb.append("   \\\\_|_||_||_|_//  \\ |\n");
        sb.append("    \\___________/    \\|");
        return sb.toString();
    }

    /**
     * Create a string of the ligthning elf kissing
     * @return String
     */
    @Override
    public String kiss() {
        StringBuilder sb = new StringBuilder();
        sb.append("     *   ---     *    ♡♡\n");
        sb.append(" *     \\|  <|/ *  ♡♡♡  *\n");
        sb.append("    *  ||\\3/||♡♡♡♡\n");
        sb.append("  *    ||   ||   *\n");
        return sb.toString();
    }

    /**
     * Return a random compliment from a list of compliments said by the ligthning elf
     * @return String
     */
    @Override
    public String compliment() {
        ArrayList<String> listCompliments = new ArrayList<>();
        listCompliments.add("I am so happy to be in you ♡");
        listCompliments.add("I like talking with you");
        listCompliments.add("You are so beautiful");
        listCompliments.add("Ohh who is this amazing person front of me");
        return listCompliments.get(new Random().nextInt(3));
    }

    /**
     * Create a string of the ligthning elf
     * @return String
     */
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
        System.out.println(ligthningElf.kiss());
    }
}
