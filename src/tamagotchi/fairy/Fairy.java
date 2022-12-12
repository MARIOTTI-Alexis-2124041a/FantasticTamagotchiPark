package tamagotchi.fairy;
import tamagotchi.Tamagotchi;
import java.util.Random;

public abstract class Fairy extends Tamagotchi {
    boolean isFlying = false;

    //Generate random size between 5 and 15
    int wingsSize = new Random().nextInt(15 - 5) + 5;

    public boolean isFlying() {
        return isFlying;
    }

    public void fly() {
        if (isFlying) {
            System.out.println("The fairy is already flying");
        }
        else {
            isFlying = true;
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

    abstract void userPower();
}
