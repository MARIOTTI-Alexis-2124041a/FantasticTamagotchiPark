package src;

import src.bar.Bar;
import src.tamagotchi.Tamagotchi;

import java.util.ArrayList;
import java.util.Scanner;

public class Interaction {

    private ArrayList<ArrayList<Tamagotchi>> allTamagotchiByFammily;

    private Tamagotchi actualTamagotchi;


    public Interaction() {
        actualTamagotchi = null;

        this.allTamagotchiByFammily = new ArrayList<ArrayList<Tamagotchi>>();

        //create and add all tamagotchi
    }

    public static void main(String[] args) {
        Interaction interaction = new Interaction();

        String userMessage = new String();

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("----------------------------------------\n--Welcome to FANTASTIC TAMAGOTCHI PARK--\n----------------------------------------\n\ntype \"help\" to know what you can do");

        while (! userMessage.equals("exit")){
            userMessage = inputScanner.nextLine();

            System.out.println(userMessage);

            if (interaction.actualTamagotchi != null){

            }
            //implement randoms actions of the actual tamagotchi
        }
    }
}
