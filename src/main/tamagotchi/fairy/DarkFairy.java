package tamagotchi.fairy;

import tamagotchi.Race;
import tamagotchi.type.Dark;
import tamagotchi.type.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DarkFairy extends Fairy implements Dark {

    public DarkFairy(String name) {
        super(name, Race.FAIRY, Type.DARK);

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
    public String usePower() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ~   _     _  ~   ~ \n");
        sb.append("~    / \\   / \\   ~\n");
        sb.append("   ~ \\  ( )  / _____ /|\\ /|\\ \n");
        sb.append("       (| |)   ===== \\|/ \\|/ \n");
        sb.append("      /_|_|_\\\n");
        return sb.toString();
    }
    @Override
    public String cry() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ~     _     _  ~   ~ \n");
        sb.append("~     ｡/｡\\   /｡\\｡  ~\n");
        sb.append("     ｡~\\ ･( )･ / ｡    moAAAA \n");
        sb.append("    ｡    (| |)   ｡           aaaAA\n");
        sb.append("   ｡｡   /_|_|_\\   ｡                AAAA...\n");
        return sb.toString();
    }

    @Override
    public String complain() {
        List<String> listComplain = new ArrayList<>();
        listComplain.add("I tired of living with ligthning fairy... ");
        listComplain.add("I have been hungry for too long !");
        listComplain.add("I am boring...");
        listComplain.add("My wings are to small !!");
        listComplain.add("pfffFFFF");
        return listComplain.get(new Random().nextInt(4));
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
    public static void main(String args[]) {
        DarkFairy darkFairy = new DarkFairy("jj");
        System.out.println(darkFairy.toString());
        System.out.println(darkFairy.cry());
        System.out.println(darkFairy.complain());
    }
}
