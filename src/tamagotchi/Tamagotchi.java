package src.tamagotchi;

public abstract class Tamagotchi {
    String name;
    //Déclaration des Bar
    Bar hungerBar;
    Bar tirenessBar;
    Bar hapinessBar;
    Race race;
    Type type;

    //Déclaration des méthodes
    public String getName() {
        return name;
    }
    public Bar getHungerBar(){
        return hungerBar;
    }

    public Bar getTirenessBar() {
        return tirenessBar;
    };

    public Bar getHapinessBar() {
        return hapinessBar;
    }

    public Race getRace() {
        return race;
    }
    public Type getType() {
        return type;
    }
    abstract public String displayInformation();

    public void feed (int quantity) {

    }
    abstract public void sleep(int time);
    abstract public void joke();
    abstract public void pet(int time);
    @Override
    abstract public String toString();
}
