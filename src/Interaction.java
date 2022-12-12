package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Interaction {

    //private ArrayList<ArrayList<Tamagotchi>> allTamagotchiByFammily;


    public Interaction() {
        //this.allTamagotchiByFammily = new ArrayList<ArrayList<Tamagotchi>>();

        //create and add all tamagotchi
    }

    public static void main(String[] args) {
        String userMessage = new String();

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("----------------------------------------\n--Welcome to FANTASTIC TAMAGOTCHI PARK--\n----------------------------------------\n\ntype \"help\" to know what you can do");

        while (! userMessage.equals("exit")){
            userMessage = inputScanner.nextLine();

            System.out.println(userMessage);
        }
    }
}
