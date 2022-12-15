import tamagotchi.Tamagotchi;
import tamagotchi.elf.DarkElf;
import tamagotchi.elf.Elf;
import tamagotchi.elf.LightningElf;
import tamagotchi.fairy.DarkFairy;
import tamagotchi.fairy.Fairy;
import tamagotchi.fairy.LightningFairy;
import tamagotchi.type.Dark;
import tamagotchi.type.Lightning;
import tamagotchi.type.Type;

import java.util.*;

public class Interaction {
    /**
     * List containing all of the tamagotchis, separated by family
     */
    private ArrayList<ArrayList<Tamagotchi>> allTamagotchiByFamily;

    /**
     * The tamagotchi currently selected
     */
    private Tamagotchi currentTamagotchi;

    /**
     * HashMap storing the jokes that a tamagotchi can tell, as well as their respective id
     */
    public static HashMap<Integer,String> jokes = new HashMap<Integer,String>();
    static {
        //creating the joke
        jokes.put(1,"Why do cows wear bells?\nBecause their horns don't work."); //soft
        jokes.put(2,"I threw a boomerang a few years ago.\nAnd now I live in a constant fear");  //medium
        jokes.put(3,"A Roman legionnaire walks into a bar, holds up two finger and says,\n\"Five beers, please.\""); //not funny
        jokes.put(4,"You don't need a parachute to go skydiving.\nYou need a parachute to go skydiving twice."); //Dark

    }

    public Interaction() {
        currentTamagotchi = null;

        this.allTamagotchiByFamily = new ArrayList<ArrayList<Tamagotchi>>();

        //create and add all tamagotchi

        //fairy family
        ArrayList<Tamagotchi> fairies = new ArrayList<>();

        Tamagotchi loue = new DarkFairy("Loue");
        fairies.add(loue);

        Tamagotchi elisa = new LightningFairy("Elisa");
        fairies.add(elisa);

        //Elf family
        ArrayList<Tamagotchi> elves = new ArrayList<>();

        Tamagotchi urbain = new DarkElf("Urbain");
        elves.add(urbain);

        Tamagotchi giovanni = new LightningElf("Giovanny");
        elves.add(giovanni);

        this.allTamagotchiByFamily.add(elves);
        this.allTamagotchiByFamily.add(fairies);
    }

    /**
     * Return true if the specified object is in the given array
     * @param array The array i which you want to search the item
     * @param item The element to search in the given array
     * @param <T>
     * @return boolean
     */
    private <T> boolean contain(T[] array, T item){
        for (T element : array) {
            if (element.equals(item)){
                return true;
            }
        }
        return false;
    }

    /**
     * Return true if the specified object is in the given array
     * @param array The array i which you want to search the item
     * @param item The element to search in the given array
     * @param <T>
     * @return boolean
     */
    private <T> boolean contain(T[] array, T item, int start){
        int count = 0;
        for (T element : array) {
            if (count >= start){
                if (element.equals(item)){
                    return true;
                }
            }
            else{
                ++count;
            }
        }
        return false;
    }

    /**
     * Sorts Tamagotchi by hunger
     * @return ArrayList<Tamagotchi> : list sorted by hunger
     */
     private ArrayList<Tamagotchi> sortByHunger(){
        //recuperation of all tamagotchi in one List
         ArrayList<Tamagotchi> sortTamagotchi = new ArrayList<Tamagotchi>();

         for (ArrayList<Tamagotchi> family : this.allTamagotchiByFamily) {
             for (Tamagotchi currentTamagotchi : family) {
                 sortTamagotchi.add(currentTamagotchi);
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

    /**
     * Sorts Tamagotchi by tiredness
     * @return ArrayList<Tamagotchi> : list sorted by tiredness
     */
    private ArrayList<Tamagotchi> sortByTiredness(){
        //recuperation of all tamagotchi in one List
        ArrayList<Tamagotchi> sortTamagotchi = new ArrayList<Tamagotchi>();

        for (ArrayList<Tamagotchi> family : this.allTamagotchiByFamily) {
            for (Tamagotchi currentTamagotchi : family) {
                sortTamagotchi.add(currentTamagotchi);
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

    /**
     * Sorts Tamagotchi by happiness
     * @return ArrayList<Tamagotchi> : list sorted by happiness
     */
    private ArrayList<Tamagotchi> sortByHappiness(){
        //recuperation of all tamagotchi in one List
        ArrayList<Tamagotchi> sortTamagotchi = new ArrayList<Tamagotchi>();

        for (ArrayList<Tamagotchi> family : this.allTamagotchiByFamily) {
            for (Tamagotchi currentTamagotchi : family) {
                sortTamagotchi.add(currentTamagotchi);
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
                    for (ArrayList<Tamagotchi> family : interaction.allTamagotchiByFamily) {
                        for (Tamagotchi currentTamagotchi : family) {
                            currentTamagotchi.getHungerBar().decreaseBar((int) (currentTamagotchi.getHungerBar().getMax()*0.1));
                            currentTamagotchi.getHappinessBar().decreaseBar((int) (currentTamagotchi.getHappinessBar().getMax()*0.07));
                            //For fairy flying
                            if (currentTamagotchi instanceof Fairy && ((Fairy) currentTamagotchi).isFlying()){
                                if (new Random().nextInt(10) > 7){
                                    ((Fairy) currentTamagotchi).stopFly();
                                }
                                //tired x2 because flying
                                currentTamagotchi.getTirenessBar().decreaseBar((int) (currentTamagotchi.getTirenessBar().getMax()*0.1));
                            } else{
                                currentTamagotchi.getTirenessBar().decreaseBar((int) (currentTamagotchi.getTirenessBar().getMax()*0.05));
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
                            System.out.println(tamagotchi.displayTirenessBar());
                        }
                    } else if (userMessageSplit[1].equals("hunger")){
                        for (Tamagotchi tamagotchi : interaction.sortByHunger()) {
                            System.out.println("\tName : " + tamagotchi.getName());
                            System.out.println("\tRace : " + tamagotchi.getRace());
                            System.out.println("\tType : " + tamagotchi.getType());
                            System.out.println(tamagotchi.displayHungerBar());
                        }
                    } else if (userMessageSplit[1].equals("happiness")){
                        for (Tamagotchi tamagotchi : interaction.sortByHappiness()) {
                            System.out.println("\tName : " + tamagotchi.getName());
                            System.out.println("\tRace : " + tamagotchi.getRace());
                            System.out.println("\tType : " + tamagotchi.getType());
                            System.out.println(tamagotchi.displayHappinessBar());
                        }
                    }
                    //for invalid 1st argument
                    else {
                        System.out.println("Invalid argument ! " + userMessageSplit[1] + " is not a valid argument for seeAll command. Please type \"help\"");
                    }
                } else if (userMessageSplit.length == 1) {
                    try {
                        System.out.println("Current : " + interaction.currentTamagotchi.getName() + "\n");
                    } catch (Exception exception) {
                        System.out.println("Current : no one\n");
                    }
                    for (ArrayList<Tamagotchi> family : interaction.allTamagotchiByFamily) {
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

                    for (ArrayList<Tamagotchi> family : interaction.allTamagotchiByFamily) {
                        for (Tamagotchi currentTamagotchi : family) {
                            if (currentTamagotchi.getName().equals(name)) {
                                interaction.currentTamagotchi = currentTamagotchi;
                                isTamagotchiNotExist = false;

                                System.out.println("Went to the " + currentTamagotchi.getName() + " cage!");
                            }
                        }
                    }
                    if (isTamagotchiNotExist) {
                        System.out.println("This tamagotchi does not exist ! Type \"seeAll\" to see all tamagotchi");
                    }
                }
                //for unknown command with a see prefix
                else{
                    System.out.println("Too many arguments ! Please type Help");
                }
            }
            else if (userMessageSplit[0].equals("exit")){
                System.out.println("See you soon");
            }
            //help command
            else if (userMessageSplit[0].equals("help")){
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "seeAll")){
                    System.out.println("\tseeAll : \n\t\thunger : display all Tamagotchies sorted by hunger and display name, race, type and hunger bar\n\t\thappiness : display all Tamagotchies sorted by happiness and display name, race, type and happiness bar\n\t\ttiredness : display all Tamagotchies sorted by tiredness and display name, race, type and tiredness bar\n\t\tno arguments : display all Tamagotchies order by families and display name, type and graphical representation\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "see")){
                    System.out.println("\tsee : \n\t\t\"name of a tamagotchi\" : go to the given tamagotchi cage, and allows you to do stuff with him\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "joke")){
                    System.out.println("\tjoke : \n\t\tno arguments : need to be in the cage of a tamagotchi, and increased or decreased his happiness depending on the chosen joke\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "pet")){
                    System.out.println("\tpet : \n\t\tno arguments : need to be in the cage of a tamagotchi, and increased his happiness with a random value\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "sleep")){
                    System.out.println("\tsleep : \n\t\tno arguments : need to be in the cage of a tamagotchi, and increased tiredness depending with a random value\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "information")){
                    System.out.println("\tinformation : \n\t\tno arguments : need to be in the cage of a tamagotchi, and display all vitals of this tamagotchi\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "fly")){
                    System.out.println("\tfly : \n\t\tno arguments : need to be in the cage of a Fairy, the fairy starts to fly if she is not already flying, when she flies she gets twice as tired\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "retort")){
                    System.out.println("\tretort : \n\t\tno arguments : need to be in the cage of an elf, the elf throws you a haughty retort, typical among elves\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "whoHasBiggest")){
                    System.out.println("\twhoHasBiggest : \n\t\tno arguments : need to be in the cage of an elf, the elf  tells you the size of his ears and he is proud of it\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "music")){
                    System.out.println("\tmusic : \n\t\tno arguments : need to be in the cage of an elf, the elf starts playing his favorite instrument\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "power")){
                    System.out.println("\tpower : \n\t\tno arguments : need to be in the cage of a Fairy, and she does a pretty spell\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "cry")){
                    System.out.println("\tcry : \n\t\tno arguments : need to be in the cage of a dark tamagotchi, the tamagotchi cries all the tears of his body\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "complain")){
                    System.out.println("\tcomplain : \n\t\tno arguments : need to be in the cage of a dark tamagotchi, the tamagotchi complains about his shitty life\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "kiss")){
                    System.out.println("\tkiss : \n\t\tno arguments : need to be in the cage of a lightning tamagotchi, the tamagotchi gives you a kiss\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "compliment")){
                    System.out.println("\tcompliment : \n\t\tno arguments : need to be in the cage of a lightning tamagotchi, the tamagotchi gives you a kindfull compliment\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "collectiveHappiness")){
                    System.out.println("\tcollectiveHappiness : \n\t\tno arguments : the fairy casts a happiness spell on all the tamagotchi\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "exit")){
                    System.out.println("\texit : \n\t\tno arguments : exit this game\n");
                }
                if (userMessageSplit.length == 1 || interaction.contain(userMessageSplit, "help", 1)){
                    System.out.println("\thelp : \n\t\t\"name of a command\" (multiargs)) : display the help of given commands\n\t\tno arguments : display this\n");
                }
            }
            //verify if user type a command for a specific Tamagotchi
            else if (interaction.currentTamagotchi != null){
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
                        System.out.println(interaction.currentTamagotchi.joke(Integer.parseInt(userChoice)));
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Invalid joke number! Please select a correct number!");
                    }
                }
                else if(userMessageSplit[0].equals("information")){
                    //display information
                    System.out.println(interaction.currentTamagotchi.displayInformation());
                }
                else if (userMessageSplit[0].equals("feed")){
                    System.out.println("You what to feed " + interaction.currentTamagotchi.getName() + " with witch food ?\n\"1\" for a steak\n\"2\" for a salad\n\"3\" for a Tiramisu");

                    String userChoice = inputScanner.nextLine().trim(); //user input

                    //parse userChoice
                    try{
                        //display the tamagotchi joke reaction
                        int mealInt = Integer.parseInt(userChoice);
                        switch (mealInt){
                            case 1:
                                interaction.currentTamagotchi.feed(50);
                                break;
                            case 2:
                                interaction.currentTamagotchi.feed(15);
                                break;
                            case 3:
                                interaction.currentTamagotchi.feed(30);
                                break;
                        }

                        System.out.println(interaction.currentTamagotchi.getName() + " enjoys the meal...\n" + interaction.currentTamagotchi.getHungerBar().displayBar());
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Invalid food number! Please select a correct number!");
                    }
                }
                else if (userMessageSplit[0].equals("pet")){
                    System.out.println(interaction.currentTamagotchi.pet());
                }
                else if (userMessageSplit[0].equals("sleep")){
                    System.out.println(interaction.currentTamagotchi.sleep());
                }
                else if (userMessageSplit[0].equals("fly")){
                    if (interaction.currentTamagotchi instanceof Fairy){
                        System.out.println(((Fairy) interaction.currentTamagotchi).fly());
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not an fairy, chose a fairy to use \"fly\" command");
                    }
                }
                else if (userMessageSplit[0].equals("retort")){
                    if (interaction.currentTamagotchi instanceof Elf){
                        System.out.println(((Elf) interaction.currentTamagotchi).sillyRetort());
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not an elf, chose an elf to use \"retort\" command");
                    }
                }
                else if (userMessageSplit[0].equals("whoHasBiggest")){
                    if (interaction.currentTamagotchi instanceof Elf){
                        System.out.println(((Elf) interaction.currentTamagotchi).sayHeHasBiggest());
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not an elf, chose an elf to use \"whoHasBiggest\" command");
                    }
                }
                else if (userMessageSplit[0].equals("music")){
                    if (interaction.currentTamagotchi instanceof Elf){
                        System.out.println(((Elf) interaction.currentTamagotchi).playAnInstrument());
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not an elf, chose an elf to use \"music\" command");
                    }
                }
                else if (userMessageSplit[0].equals("power")){
                    if (interaction.currentTamagotchi instanceof Fairy){
                        System.out.println(((Fairy) interaction.currentTamagotchi).usePower());
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not a fairy, chose an fairy to use \"power\" command");
                    }
                }
                else if (userMessageSplit[0].equals("cry")){
                    if (interaction.currentTamagotchi.getType() == Type.DARK){
                        System.out.println(((Dark) interaction.currentTamagotchi).cry());
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not dark, chose a tamagotchi with dark type to use \"cry\" command");
                    }
                }
                else if (userMessageSplit[0].equals("complain")){
                    if (interaction.currentTamagotchi.getType() == Type.DARK){
                        System.out.println(((Dark) interaction.currentTamagotchi).complain());
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not dark, chose a tamagotchi with dark type to use \"complain\" command");
                    }
                }
                else if (userMessageSplit[0].equals("kiss")){
                    if (interaction.currentTamagotchi.getType() == Type.LIGHTNING){
                        System.out.println(((Lightning) interaction.currentTamagotchi).kiss());
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not lightning, chose a tamagotchi with lightning type to use \"kiss\" command");
                    }
                }
                else if (userMessageSplit[0].equals("compliment")){
                    if (interaction.currentTamagotchi.getType() == Type.LIGHTNING){
                        System.out.println(((Lightning) interaction.currentTamagotchi).compliment());
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not lightning, chose a tamagotchi with lightning type to use \"compliment\" command");
                    }
                }
                else if (userMessageSplit[0].equals("collectiveHappiness")){
                    if (interaction.currentTamagotchi instanceof Fairy){
                        //increase all the Tamagotchi by the collectiveHappiness level
                        int happinessIncrement = ((Fairy) interaction.currentTamagotchi).collectiveHappiness();

                        for (ArrayList<Tamagotchi> family : interaction.allTamagotchiByFamily) {
                            for (Tamagotchi currentTamagotchi : family) {
                                currentTamagotchi.getHappinessBar().increaseBar(happinessIncrement);
                            }
                        }
                        System.out.println(interaction.currentTamagotchi.getName() + " casts a spell that makes everyone happier\n");
                        //display all tamagotchies bar's sorted by happiness
                        for (Tamagotchi tamagotchi : interaction.sortByHappiness()) {
                            System.out.println("\tName : " + tamagotchi.getName());
                            System.out.println("\tRace : " + tamagotchi.getRace());
                            System.out.println("\tType : " + tamagotchi.getType());
                            System.out.println(tamagotchi.displayHappinessBar());
                        }
                    }
                    else {
                        System.out.println(interaction.currentTamagotchi.getName() + " is not a fairy, chose an fairy to use \"collectiveHappiness\" command");
                    }
                }
                else{
                    System.out.println("Unknown command ! Please type \"Help\" to see all commands");
                }
            }
            else if (userMessageSplit[0].equals("feed") || userMessageSplit[0].equals("joke") || userMessageSplit[0].equals("pet") || userMessageSplit[0].equals("sleep") || userMessageSplit[0].equals("information") || userMessageSplit[0].equals("sleep") || userMessageSplit[0].equals("fly") || userMessageSplit[0].equals("retort") || userMessageSplit[0].equals("whoHasBiggest") || userMessageSplit[0].equals("music")|| userMessageSplit[0].equals("power") || userMessageSplit[0].equals("cry") || userMessageSplit[0].equals("complain") || userMessageSplit[0].equals("kiss") || userMessageSplit[0].equals("compliment") || userMessageSplit[0].equals("collectiveHappiness")){
                System.out.println("You need to see a specific Tamagotchi with \"see\" command");
            }
            else{
                System.out.println("Unknown command ! Please type \"Help\" to see all commands");
            }
        }
        //To stop the game
        barManagement.interrupt();
    }
}
