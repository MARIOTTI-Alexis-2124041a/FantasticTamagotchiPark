package tamagotchi.fairy;
import bar.Bar;
import tamagotchi.Race;
import tamagotchi.Tamagotchi;
import tamagotchi.type.Type;

import java.util.Random;

public abstract class Fairy extends Tamagotchi {
    boolean isFlying = false;

    //Generate random size between 5 and 15
    int wingsSize = new Random().nextInt(15 - 5) + 5;

    public Fairy(String name, Race race, Type type) {
        super(name, race, type);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public String fly() {
        if (isFlying) {
            return this.getName() +" is already flying";
        }
        isFlying = true;
        return this.getName() + " is now flying";
    }

    public void stopFly(){
        if (this.isFlying){
            this.isFlying = false;
        }
    }

    public int getWingsSize() {
        return wingsSize;
    }

    /**
     * Generate a random value to share happiness to other tamagotchi
     * @return int
     */
    public int collectiveHappiness() {
        return new Random().nextInt(100) + 1;
    }

    public abstract String usePower();
}
