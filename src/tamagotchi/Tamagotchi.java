package src.tamagotchi;

public interface Tamagotchi {
    private String name;

    //Déclaration des Bar
    private Bar hungerBar;
    private Bar tirenessBar;
    private Bar hapinessBar;
    private Race race;
    private Type type;

    //Déclaration des méthodes
    public String getName();
    public Bar getHungerBar();

    public void setHungerBar(Bar hungerBar);

    public Bar getTirenessBar();
    public void setTirenessBar(Bar tirenessBar);

    public Bar getHapinessBar();
    public void setHapinessBar(Bar hapinessBar);
    public Race getRace();
    public Type getType();
    public String displayInformation();

    public void feed (int quantity);
    public void sleep(int time);
    public void joke();
    public void pet(int time);
    public String toString();
}
