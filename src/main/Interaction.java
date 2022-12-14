


import tamagotchi.Tamagotchi;
import tamagotchi.elf.DarkElf;
import tamagotchi.elf.Elf;
import tamagotchi.elf.LigthningElf;
import tamagotchi.fairy.DarkFairy;
import tamagotchi.fairy.Fairy;
import tamagotchi.fairy.LigthningFairy;
import tamagotchi.type.Dark;
import tamagotchi.type.Lightning;
import tamagotchi.type.Type;

import java.util.*;

public class Interaction {

    private ArrayList<ArrayList<Tamagotchi>> allTamagotchiByFammily;

    private Tamagotchi actualTamagotchi;

    public static HashMap<Integer,String> jokes = new HashMap<Integer,String>();
    static {
        //creating the joke
        jokes.put(1,"Why do cows wear bells?\nBecause their horns don't work."); //soft
        jokes.put(2,"I threw a boomerang a few year ago.\nAnd now i live in a constant fear");  //medium
        jokes.put(3,"A Roman legionnaire walks into a bar, holds up two finger ans say,\n\"Five beers, please.\""); //not funny
        jokes.put(4,"You don't need a parachute to go skydiving.\nYou need a parachute to skydiving twice."); //Dark

    }

     private ArrayList<Tamagotchi> sortByHunger(){
        //recuperation of all tamagotchi in one List
         ArrayList<Tamagotchi> sortTamagotchi = new ArrayList<Tamagotchi>();

         for (ArrayList<Tamagotchi> family : this.allTamagotchiByFammily) {
             for (Tamagotchi actualTamagotchi : family) {
                 sortTamagotchi.add(actualTamagotchi);
             }
         }

         //sort using selection sort

         int pos;
         Tamagotchi temp;
         for (int i = 0; i < sortTamagotchi.size(); i++)
         {
             pos = i;
             for (int j = i+1; j < sortTamagotchi.size(); j++)
             {
                 if (sortTamagotchi.get(j).getHungerBar().getCurrentValue() < sortTamagotchi.get(pos).getHungerBar().getCurrentValue())
                 {
                     pos = j;
                 }
             }

             temp = sortTamagotchi.get(pos);
             sortTamagotchi.set(pos, sortTamagotchi.get(i));
             sortTamagotchi.set(i, temp);
         }

         return sortTamagotchi;
     }

    private ArrayList<Tamagotchi> sortByTiredness(){
        //recuperation of all tamagotchi in one List
        ArrayList<Tamagotchi> sortTamagotchi = new ArrayList<Tamagotchi>();

        for (ArrayList<Tamagotchi> family : this.allTamagotchiByFammily) {
            for (Tamagotchi actualTamagotchi : family) {
                sortTamagotchi.add(actualTamagotchi);
            }
        }

        //sort using selection sort

        int pos;
        Tamagotchi temp;
        for (int i = 0; i < sortTamagotchi.size(); i++)
        {
            pos = i;
            for (int j = i+1; j < sortTamagotchi.size(); j++)
            {
                if (sortTamagotchi.get(j).getTirenessBar().getCurrentValue() < sortTamagotchi.get(pos).getTirenessBar().getCurrentValue())
                {
                    pos = j;
                }
            }

            temp = sortTamagotchi.get(pos);
            sortTamagotchi.set(pos, sortTamagotchi.get(i));
            sortTamagotchi.set(i, temp);
        }

        return sortTamagotchi;
    }

    private ArrayList<Tamagotchi> sortByHappiness(){
        //recuperation of all tamagotchi in one List
        ArrayList<Tamagotchi> sortTamagotchi = new ArrayList<Tamagotchi>();

        for (ArrayList<Tamagotchi> family : this.allTamagotchiByFammily) {
            for (Tamagotchi actualTamagotchi : family) {
                sortTamagotchi.add(actualTamagotchi);
            }
        }

        //sort using selection sort

        int pos;
        Tamagotchi temp;
        for (int i = 0; i < sortTamagotchi.size(); i++)
        {
            pos = i;
            for (int j = i+1; j < sortTamagotchi.size(); j++)
            {
                if (sortTamagotchi.get(j).getHappinessBar().getCurrentValue() < sortTamagotchi.get(pos).getHappinessBar().getCurrentValue())
                {
                    pos = j;
                }
            }

            temp = sortTamagotchi.get(pos);
            sortTamagotchi.set(pos, sortTamagotchi.get(i));
            sortTamagotchi.set(i, temp);
        }

        return sortTamagotchi;
    }

    public Interaction() {
        actualTamagotchi = null;

        this.allTamagotchiByFammily = new ArrayList<ArrayList<Tamagotchi>>();

        //create and add all tamagotchi

        //fairy family
        ArrayList<Tamagotchi> fairies = new ArrayList<>();

        Tamagotchi loue = new DarkFairy("Loue");
        fairies.add(loue);

        Tamagotchi elisa = new LigthningFairy("Elisa");
        fairies.add(elisa);

        //Elf family
        ArrayList<Tamagotchi> elves = new ArrayList<>();

        Tamagotchi urbain = new DarkElf("Urbain");
        elves.add(urbain);

        Tamagotchi giovanni = new LigthningElf("Giovanny");
        elves.add(giovanni);

        this.allTamagotchiByFammily.add(elves);
        this.allTamagotchiByFammily.add(fairies);
    }

    public static void main(String[] args) {
        Interaction interaction = new Interaction();

        String userMessage = new String();

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\n" +
                " __      __   _                    _                                                                \n" +
                " \\ \\    / /__| |__ ___ _ __  ___  | |_ ___                                                          \n" +
                "  \\ \\/\\/ / -_) / _/ _ \\ '  \\/ -_) |  _/ _ \\                                                         \n" +
                "   \\_/\\_/\\___|_\\__\\___/_|_|_\\___|  \\__\\___/                                                         \n" +
                "                                                                                                    \n" +
                "  ___         _           _   _      _____                         _      _    _   ___          _   \n" +
                " | __|_ _ _ _| |_ __ _ __| |_(_)__  |_   _|_ _ _ __  __ _ __ _ ___| |_ __| |_ (_) | _ \\__ _ _ _| |__\n" +
                " | _/ _` | ' \\  _/ _` (_-<  _| / _|   | |/ _` | '  \\/ _` / _` / _ \\  _/ _| ' \\| | |  _/ _` | '_| / /\n" +
                " |_|\\__,_|_||_\\__\\__,_/__/\\__|_\\__|   |_|\\__,_|_|_|_\\__,_\\__, \\___/\\__\\__|_||_|_| |_| \\__,_|_| |_\\_\\\n" +
                "                                                         |___/                                      \n\n\ntype \"help\" to know what you can do");

        Thread barManagement = new Thread(){
            public void run(){
                while (true){
                    try {
                        Thread.currentThread().sleep(30000); //wait 30 secs
                    } catch (InterruptedException e) {
                        break;
                    }
                    //decreasing all bars
                    for (ArrayList<Tamagotchi> family : interaction.allTamagotchiByFammily) {
                        for (Tamagotchi actualTamagotchi : family) {
                            actualTamagotchi.getHungerBar().decreaseBar((int) (actualTamagotchi.getHungerBar().getMax()*0.1));
                            actualTamagotchi.getHappinessBar().decreaseBar((int) (actualTamagotchi.getHappinessBar().getMax()*0.07));
                            //For fairy flying
                            if (actualTamagotchi instanceof Fairy && ((Fairy) actualTamagotchi).isFlying()){
                                if (new Random().nextInt(10) > 7){
                                    ((Fairy) actualTamagotchi).stopFly();
                                }
                                //tired x2 because flying
                                actualTamagotchi.getTirenessBar().decreaseBar((int) (actualTamagotchi.getTirenessBar().getMax()*0.1));
                            } else{
                                actualTamagotchi.getTirenessBar().decreaseBar((int) (actualTamagotchi.getTirenessBar().getMax()*0.05));
                            }
                        }
                    }
                }
            }
        };
        //Start the bar management
        barManagement.start();

        while (! userMessage.equals("exit")){
            System.out.print("~FTP-$");
            userMessage = inputScanner.nextLine().trim();

            //Split the message by words
            String[] userMessageSplit = userMessage.split("\\W+");

            //for seeAll command
            if (userMessageSplit[0].equals("seeAll")) {
                if (userMessageSplit.length == 2) {
                    if (userMessageSplit[1].equals("tiredness")){
                        for (Tamagotchi tamagotchi : interaction.sortByTiredness()) {
                            System.out.println("\tName : " + tamagotchi.getName());
                            System.out.println("\tRace : " + tamagotchi.getRace());
                            System.out.println("\tType : " + tamagotchi.getType());
                            System.out.println(tamagotchi.getTirenessBar().displayBar());
                        }
                    } else if (userMessageSplit[1].equals("hunger")){
                        for (Tamagotchi tamagotchi : interaction.sortByHunger()) {
                            System.out.println("\tName : " + tamagotchi.getName());
                            System.out.println("\tRace : " + tamagotchi.getRace());
                            System.out.println("\tType : " + tamagotchi.getType());
                            System.out.println(tamagotchi.getHungerBar().displayBar());
                        }
                    } else if (userMessageSplit[1].equals("happiness")){
                        for (Tamagotchi tamagotchi : interaction.sortByHappiness()) {
                            System.out.println("\tName : " + tamagotchi.getName());
                            System.out.println("\tRace : " + tamagotchi.getRace());
                            System.out.println("\tType : " + tamagotchi.getType());
                            System.out.println(tamagotchi.getHappinessBar().displayBar());
                        }
                    }
                    //for invalid 1st argument
                    else {
                        System.out.println("Invalid argument ! " + userMessageSplit[1] + " is not a valid argument for seeAll command. Please type \"help\"");
                    }
                } else if (userMessageSplit.length == 1) {
                    try {
                        System.out.println("Actual : " + interaction.actualTamagotchi.getName() + "\n");
                    } catch (Exception exception) {
                        System.out.println("Actual : no one\n");
                    }
                    for (ArrayList<Tamagotchi> family : interaction.allTamagotchiByFammily) {
                        if (family.size() > 0) {
                            System.out.println(family.get(0).getRace() + " :");
                        }
                        for (Tamagotchi tamagotchi : family) {
                            System.out.println("\tName: " + tamagotchi.getName() + "\n\tType: " + tamagotchi.getType());
                            //for see ASCII Art
                            System.out.println(tamagotchi);
                        }
                    }
                }
                else {
                    System.out.println("Too much argument ! Please type \"help\"");
                }
            }
            //verifying if user type a global command
            else if (userMessageSplit[0].equals("see")){

                //If there is no argument
                if (userMessageSplit.length < 2){
                    System.out.println("Please specify a Tamagotchi to see !");
                }
                else if (userMessageSplit.length == 2) {
                    //basic see command treatment
                    String name = new String(userMessageSplit[1]);
                    boolean isTamagotchiNotExist = true;

                    for (ArrayList<Tamagotchi> family : interaction.allTamagotchiByFammily) {
                        for (Tamagotchi actualTamagotchi : family) {
                            if (actualTamagotchi.getName().equals(name)) {
                                interaction.actualTamagotchi = actualTamagotchi;
                                isTamagotchiNotExist = false;

                                System.out.println("Go to the " + actualTamagotchi.getName() + " cage!");
                            }
                        }
                    }
                    if (isTamagotchiNotExist) {
                        System.out.println("This tamagotchi does not exist ! Type \"seeAll\" to see all tamagotchi");
                    }
                }
                //for unknown command with a see prefix
                else{
                    System.out.println("Too much argument ! Please type Help");
                }
            }
            else if (userMessageSplit[0].equals("exit")){
                System.out.println("See you soon");
            }
            //verify if user type a command for a specific Tamagotchi
            else if (interaction.actualTamagotchi != null){
                if (userMessageSplit[0].equals("joke")){

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
                else if(userMessageSplit[0].equals("information")){
                    //display information
                    System.out.println(interaction.actualTamagotchi.displayInformation());
                }
                else if (userMessageSplit[0].equals("feed")){
                    System.out.println("You what to feed " + interaction.actualTamagotchi.getName() + " with witch food ?\n\"1\" for a steak\n\"2\" for a salad\n\"3\" for a Tiramisu");

                    String userChoice = inputScanner.nextLine().trim(); //user input

                    //parse userChoice
                    try{
                        //display the tamagotchi joke reaction
                        int mealInt = Integer.parseInt(userChoice);
                        switch (mealInt){
                            case 1:
                                interaction.actualTamagotchi.feed(50);
                                break;
                            case 2:
                                interaction.actualTamagotchi.feed(15);
                                break;
                            case 3:
                                interaction.actualTamagotchi.feed(30);
                                break;
                        }

                        System.out.println(interaction.actualTamagotchi.getName() + " enjoy th meal...\n" + interaction.actualTamagotchi.getHungerBar().displayBar());
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Invalid food number! Please select a correct number!");
                    }
                }
                else if (userMessageSplit[0].equals("pet")){
                    System.out.println(interaction.actualTamagotchi.pet());
                }
                else if (userMessageSplit[0].equals("sleep")){
                    System.out.println(interaction.actualTamagotchi.sleep());
                }
                else if (userMessageSplit[0].equals("fly")){
                    if (interaction.actualTamagotchi instanceof Fairy){
                        System.out.println(((Fairy) interaction.actualTamagotchi).fly());
                    }
                    else {
                        System.out.println(interaction.actualTamagotchi.getName() + " is not an fairy, chose an fairy to use \"fly\" command");
                    }
                }
                else if (userMessageSplit[0].equals("retort")){
                    if (interaction.actualTamagotchi instanceof Elf){
                        System.out.println(((Elf) interaction.actualTamagotchi).sillyRetort());
                    }
                    else {
                        System.out.println(interaction.actualTamagotchi.getName() + " is not an elf, chose an elf to use \"retort\" command");
                    }
                }
                else if (userMessageSplit[0].equals("whoHasBiggest")){
                    if (interaction.actualTamagotchi instanceof Elf){
                        System.out.println(((Elf) interaction.actualTamagotchi).sayHeHasBiggest());
                    }
                    else {
                        System.out.println(interaction.actualTamagotchi.getName() + " is not an elf, chose an elf to use \"whoHasBiggest\" command");
                    }
                }
                else if (userMessageSplit[0].equals("music")){
                    if (interaction.actualTamagotchi instanceof Elf){
                        System.out.println(((Elf) interaction.actualTamagotchi).playAnInstrument());
                    }
                    else {
                        System.out.println(interaction.actualTamagotchi.getName() + " is not an elf, chose an elf to use \"music\" command");
                    }
                }
                else if (userMessageSplit[0].equals("power")){
                    if (interaction.actualTamagotchi instanceof Fairy){
                        System.out.println(((Fairy) interaction.actualTamagotchi).usePower());
                    }
                    else {
                        System.out.println(interaction.actualTamagotchi.getName() + " is not an fairy, chose an fairy to use \"power\" command");
                    }
                }
                else if (userMessageSplit[0].equals("cry")){
                    if (interaction.actualTamagotchi.getType() == Type.DARK){
                        System.out.println(((Dark) interaction.actualTamagotchi).cry());
                    }
                    else {
                        System.out.println(interaction.actualTamagotchi.getName() + " is not dark, chose a tamagotchi with dark type to use \"cry\" command");
                    }
                }
                else if (userMessageSplit[0].equals("complain")){
                    if (interaction.actualTamagotchi.getType() == Type.DARK){
                        System.out.println(((Dark) interaction.actualTamagotchi).complain());
                    }
                    else {
                        System.out.println(interaction.actualTamagotchi.getName() + " is not dark, chose a tamagotchi with dark type to use \"complain\" command");
                    }
                }
                else if (userMessageSplit[0].equals("kiss")){
                    if (interaction.actualTamagotchi.getType() == Type.LIGHTNING){
                        System.out.println(((Lightning) interaction.actualTamagotchi).kiss());
                    }
                    else {
                        System.out.println(interaction.actualTamagotchi.getName() + " is not lightning, chose a tamagotchi with lightning type to use \"kiss\" command");
                    }
                }
                else if (userMessageSplit[0].equals("compliment")){
                    if (interaction.actualTamagotchi.getType() == Type.LIGHTNING){
                        System.out.println(((Lightning) interaction.actualTamagotchi).compliment());
                    }
                    else {
                        System.out.println(interaction.actualTamagotchi.getName() + " is not lightning, chose a tamagotchi with lightning type to use \"compliment\" command");
                    }
                }
                else{
                    System.out.println("Unknown command ! Please type \"Help\" to see all commands");
                }
            }
            else {
                if (userMessageSplit[0].equals("feed") || userMessageSplit[0].equals("joke") || userMessageSplit[0].equals("pet") || userMessageSplit[0].equals("sleep") || userMessageSplit[0].equals("information") || userMessageSplit[0].equals("sleep") || userMessageSplit[0].equals("fly") || userMessageSplit[0].equals("retort") || userMessageSplit[0].equals("whoHasBiggest") || userMessageSplit[0].equals("music")|| userMessageSplit[0].equals("power") || userMessageSplit[0].equals("cry") || userMessageSplit[0].equals("complain") || userMessageSplit[0].equals("kiss") || userMessageSplit[0].equals("compliment")){
                    System.out.println("You need to see a specific Tamagotchi with \"see\" command");
                }
                else{
                    System.out.println("Unknown command ! Please type \"Help\" to see all commands");
                }
            }
        }
        //for stop the game
        barManagement.interrupt();
    }
}
