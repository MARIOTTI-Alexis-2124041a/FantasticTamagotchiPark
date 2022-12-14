package tamagotchi.fairy;

import tamagotchi.Race;
import tamagotchi.type.Lightning;
import tamagotchi.type.Type;

import java.util.ArrayList;
import java.util.Random;

public class LigthningFairy extends Fairy implements Lightning {

    public LigthningFairy(String name) {
        super(name, Race.FAIRY, Type.LIGHTNING);
    }

    /**
     * Change the happiness bar of ligthning fairy depending on the joke
     * @param jokeNumber
     * @return String
     */
    @Override
    public String joke(int jokeNumber) {
        switch (jokeNumber) {
            case 1 :
                getHappinessBar().increaseBar(20); // Type of joke = lovely
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
     * Create a string of the ligthning fairy using his power
     * @return String
     */
    @Override
    public String usePower() {
        StringBuilder sb = new StringBuilder();
        sb.append("  *   _     _  *   *    \n");
        sb.append("*    / \\   / \\   *     x     *  \n");
        sb.append("   * \\  ( )  / _____  xxx   ***\n");
        sb.append("       (| |)   =====    x     *\n");
        sb.append("      /_|_|_\\          \n");
        return sb.toString();
    }

    /**
     * Create a string of the ligthning fairy kissing
     * @return String
     */
    @Override
    public String kiss() {
        StringBuilder sb = new StringBuilder();
        sb.append("  *   _     _  *   * \n");
        sb.append("*    / \\   / \\   *     ♡ ♡   ♡ ♡ \n");
        sb.append("   * \\  ( )♡ /       ♡     ♡     ♡\n");
        sb.append("       (| |) ♡        ♡         ♡\n");
        sb.append("      /_|_|_\\ ♡         ♡     ♡\n");
        sb.append("                ♡          ♡ \n");
        sb.append("                 ♡        ♡\n");
        sb.append("                    ♡  ♡  \n");
        return sb.toString();
    }

    /**
     * Return a random compliment from a list of compliments said by the ligthning fairy
     * @return String
     */
    @Override
    public String compliment() {
        ArrayList<String> listCompliments= new ArrayList<>();
        listCompliments.add("You are so beautiful");
        listCompliments.add("Ohh you are so kind ♡");
        listCompliments.add("I am so happy to talk with you !");
        listCompliments.add("Ohh you change something ? You are amazing");
        return listCompliments.get(new Random().nextInt(3));
    }

    /**
     * Create a string of the ligthning fairy
     * @return String
     */
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

    public static void main(String args[]) {
        LigthningFairy ligthningFairy = new LigthningFairy("jj");
        System.out.println(ligthningFairy.usePower());
        System.out.println(ligthningFairy.kiss());
    }
}
