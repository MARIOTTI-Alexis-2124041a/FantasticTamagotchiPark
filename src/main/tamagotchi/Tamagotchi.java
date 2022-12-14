package tamagotchi;
import bar.Bar;
import bar.HappinessBar;
import bar.HungerBar;
import bar.TirednessBar;
import tamagotchi.type.Type;

import java.util.Random;

public abstract class Tamagotchi {
    private String name;

    //Déclaration des Bar
    private Bar hungerBar = new HungerBar();
    private Bar tirenessBar = new TirednessBar();
    private Bar hapinessBar = new HappinessBar();
    private Race race;
    private Type type;


    public Tamagotchi(String name, Race race, Type type) {
        this.name = name;
        this.race = race;
        this.type = type;
    }

    //Déclaration des méthodes
    public String getName() {
        return name;
    }
    public Bar getHungerBar() {
        return hungerBar;
    }

    public Bar getTirenessBar() {
        return tirenessBar;
    }

    public Bar getHapinessBar() {
        return hapinessBar;
    }

    public String displayHungerBar() {
        return hungerBar.displayBar();
    }

    public String displayTirenessBar() {
        return tirenessBar.displayBar();
    }

    public String displayHapinessBar() {
        return hapinessBar.displayBar();
    }
    public Race getRace() {
        return race;
    }
    public Type getType() {
        return type;
    }
    public String displayInformation() {
        return name + "vitals :\n" + hungerBar.displayBar() + "\n" + tirenessBar.displayBar() + "\n" + hapinessBar.displayBar();
    }

    public void feed (int quantity) {
        hungerBar.increaseBar(quantity);
    }
    public String sleep() {
        //Number of seconds. Max = 12h
        int time = new Random().nextInt(43200);
        //3h
        if (time < 10800) {
            tirenessBar.increaseBar(5);
            return this.name + "slept for less than 3 hours\n" + this.tirenessBar.displayBar();
        }
        //6h
        else if (time < 21600){
            tirenessBar.increaseBar(10);
            return this.name + "slept for less than 6 hours\n" + this.tirenessBar.displayBar();
        }
        //9h
        else if (time < 32400){
            tirenessBar.increaseBar(15);
            return this.name + "slept for less than 9 hours\n" + this.tirenessBar.displayBar();
        }
        else {
            tirenessBar.increaseBar(20);
            return this.name + "slept for almost 12 hours\n" + this.tirenessBar.displayBar();
        }
    }
    public String pet() {
        //Number of seconds. Max = 1h
        int time = new Random().nextInt(3600);
        //10 mins
        if (time < 600) {
            hapinessBar.increaseBar(12);
            return "you have pet " + this.name + " for less than 10 mins\n" + this.hungerBar.displayBar();
        }
        //20 mins
        else if (time < 1200){
            hapinessBar.increaseBar(24);
            return "you have pet " + this.name + " for less than 20 mins\n" + this.hungerBar.displayBar();
        }
        //45 mins
        else if (time < 2700){
            hapinessBar.increaseBar(36);
            return "you have pet " + this.name + " for less than 45 mins\n" + this.hungerBar.displayBar();
        }
        //more than 45 mins
        else {
            hapinessBar.increaseBar(50);
            return "you have pet " + this.name + " for almost an hour\n" + this.hungerBar.displayBar();
        }
    }
    abstract public String joke(int jokeNumber);
    abstract public String toString();
}
