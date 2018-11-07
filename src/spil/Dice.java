package spil;

import java.util.Random;

public class Dice {
    Random ran = new Random();
    private int eyes;

    public Dice() {
    }

    public void throwDice() {

        this.eyes = this.ran.nextInt(6) + 1;
    }

    public int getEyes()
    {
        return this.eyes;
    }
}
