

import bar.Bar;
import tamagotchi.Tamagotchi;

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

            //verifying if user type a global command
            if (userMessage.length() > 4 && userMessage.substring(0,3).equals("see")){
                String name = new String(userMessage.substring(4));
                System.out.println(name);

                for ( ArrayList<Tamagotchi> family : interaction.allTamagotchiByFammily) {
                    for (Tamagotchi tamagotchi: family) {
                        if (tamagotchi.getName().equals("name")){
                            interaction.actualTamagotchi = tamagotchi;
                        }
                    }
                }
            }
            else if (userMessage.equals("seeAll")){
                for ( ArrayList<Tamagotchi> family : interaction.allTamagotchiByFammily) {
                    if (family.size()>0){
                        System.out.println(family.get(0).getRace() +" :");
                    }
                    for (Tamagotchi tamagotchi: family) {
                        System.out.println(tamagotchi.getName());
                        //for see ASCII Art
                        System.out.println(tamagotchi);
                    }
                }
            }
            //verify if user type a command for a specific Tamagotchi
            else if (interaction.actualTamagotchi != null){
                if (userMessage=="joke"){

                }
                else{
                    System.out.println("Unknow command ! Please type Help to see all commads");
                }
            }
            else {
                if (userMessage == "feed" || userMessage == "joke" || userMessage == "pet" || userMessage == "sleep" || userMessage == "seeInformation" || userMessage == "sleep"){
                    System.out.println("You need to see a specific Tamagotchi");
                }
                else{
                    System.out.println("Unknow command ! Please type Help to see all commads");
                }
            }

            //implement randoms actions of the actual tamagotchi
        }
    }
}
