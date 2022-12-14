package tamagotchi.type;

public enum Type {
    DARK("Dark"),
    LIGHTNING("lightning");

    public final String label;
    Type(String label) {
        this.label = label;
    }
}
