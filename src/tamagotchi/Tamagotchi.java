package tamagotchi;
import bar.Bar;
import tamagotchi.type.Type;

import java.util.Random;

public abstract class Tamagotchi {
    private String name;

    //Déclaration des Bar
    private Bar hungerBar;
    private Bar tirenessBar;
    private Bar hapinessBar;
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
    public Race getRace() {
        return race;
    }
    public Type getType() {
        return type;
    }
    public String displayInformation() {
        return name + "[" + hungerBar.displayBar() + "," + tirenessBar.displayBar() + "," + hapinessBar.displayBar() + "]";
    }

    public void feed (int quantity) {
        hungerBar.increaseBar(quantity);
    }
    public void sleep() {
        //Number of seconds. Max = 12h
        int time = new Random().nextInt(43200);
        //3h
        if (time < 10800) {
            tirenessBar.increaseBar(5);
        }
        //6h
        else if (time < 21600){
            tirenessBar.increaseBar(10);
        }
        else if (time < 32400){
            tirenessBar.increaseBar(15);
        }
        else {
            tirenessBar.increaseBar(20);
        }
    }
    public void pet() {
        //Number of seconds. Max = 12h
        int time = new Random().nextInt(43200);
        //3h
        if (time < 10800) {
            hapinessBar.increaseBar(12);
        }
        //6h
        else if (time < 21600){
            hapinessBar.increaseBar(24);
        }
        else if (time < 32400){
            hapinessBar.increaseBar(36);
        }
        else {
            hapinessBar.increaseBar(50);
        }
    }
    abstract public String joke(int jokeNumber);
    abstract public String toString();
}
