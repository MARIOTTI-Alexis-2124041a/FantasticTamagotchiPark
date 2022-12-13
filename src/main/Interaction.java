

import bar.Bar;
import tamagotchi.Race;
import tamagotchi.Tamagotchi;
import tamagotchi.fairy.DarkFairy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interaction {

    private ArrayList<ArrayList<Tamagotchi>> allTamagotchiByFammily;

    private Tamagotchi actualTamagotchi;

    public static HashMap<Integer,String> jokes = new HashMap<Integer,String>();
    static {
        //creating the joke
        jokes.put(1,"I threw a boomerang a few year ago.\nAnd now i live in a constant fear");  //medium
        jokes.put(2,"You don't need a parachute to go skydiving.\nYou need a parachute to skydiving twice."); //Dark
        jokes.put(3,"A Roman legionnaire walks into a bar, holds up two finger ans say,\n\"Five beers, please.\""); //not funny
        jokes.put(4,"Why do cows wear bells?\nBecause their horns don't work."); //soft
    }

    public Interaction() {
        actualTamagotchi = null;

        this.allTamagotchiByFammily = new ArrayList<ArrayList<Tamagotchi>>();

        //create and add all tamagotchi

        ArrayList<Tamagotchi> fairy = new ArrayList<>();
        Tamagotchi loue = new DarkFairy("Loue");
        fairy.add(loue);
        this.allTamagotchiByFammily.add(fairy);
    }

    public static void main(String[] args) {
        Interaction interaction = new Interaction();

        String userMessage = new String();

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("----------------------------------------\n--Welcome to FANTASTIC TAMAGOTCHI PARK--\n----------------------------------------\n\ntype \"help\" to know what you can do");

        while (! userMessage.equals("exit")){
            System.out.print("~FTP-$");
            userMessage = inputScanner.nextLine().trim();

            //verifying if user type a global command
            if (userMessage.length()>3 && userMessage.substring(0,3).equals("see")){
                //for seeAll command
                if (userMessage.equals("seeAll")){
                    try {
                        System.out.println("Actual : " + interaction.actualTamagotchi.getName() + "\n");
                    } catch (Exception exception){
                        System.out.println("Actual : no one\n");
                    }
                    for ( ArrayList<Tamagotchi> family : interaction.allTamagotchiByFammily) {
                        if (family.size()>0){
                            System.out.println(family.get(0).getRace() +" :");
                        }
                        for (Tamagotchi tamagotchi: family) {
                            System.out.println("\t" + tamagotchi.getName());
                            //for see ASCII Art
                            System.out.println(tamagotchi);
                        }
                    }
                }
                //If there is no argument
                else if (userMessage.equals("see")){
                    System.out.println("Please specify a Tamagotchi to see !");
                }
                //basic see command treatment
                else {
                    String name = new String(userMessage.substring(4));
                    boolean isTamagotchiNotExist = true;

                    for (ArrayList<Tamagotchi> family : interaction.allTamagotchiByFammily) {
                        for (Tamagotchi actualTamagotchi : family) {
                            if (actualTamagotchi.getName().equals(name)) {
                                interaction.actualTamagotchi = actualTamagotchi;
                                isTamagotchiNotExist = false;

                                System.out.println("Go to the "+ actualTamagotchi.getName() + " cage!");
                            }
                        }
                    }

                    if (isTamagotchiNotExist){
                        System.out.println("This tamagotchi does not exist ! Type seeAll to see all tamagotchi");
                    }
                }
            }
            //verify if user type a command for a specific Tamagotchi
            else if (interaction.actualTamagotchi != null){
                if (userMessage.equals("joke")){

                    System.out.println("Select a joke :");
                    //iterate the jokes map to display it
                    for (Map.Entry<Integer, String>  joke : Interaction.jokes.entrySet()) {
                        System.out.println(joke.getKey() + " for \"" + joke.getValue()+ "\"\n");
                    }
                    String userChoice = inputScanner.nextLine().trim();

                    //parse userChoice
                    try{
                        //display the tamagotchi joke reaction
                        System.out.println(interaction.actualTamagotchi.joke(Integer.parseInt(userChoice)));
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Invalid joke number! Please select a correct number!");
                    }
                }
                else{
                    System.out.println("Unknow command ! Please type Help to see all commads");
                }
            }
            else {
                if (userMessage.equals("feed") || userMessage.equals("joke") || userMessage.equals("pet") || userMessage.equals("sleep") || userMessage.equals("seeInformation") || userMessage.equals("sleep")){
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
