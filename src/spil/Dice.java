package spil;

import java.util.Random;


//This class throws the dice and gets the total sum of the eyes.

public class Dice {
    Random ran = new Random();
    private int eyes;
    private int sum;


    public Dice() {
    }

    public void throwDice() {
    //The number of sides on the die can be changed by changing 6 to another number.
        this.eyes = this.ran.nextInt(6) + 1;
    }


    public int getEyes() {
        return this.eyes;
    }

    public int totalSum() {
        this.sum = getEyes() + getEyes();
        return sum;
    }

}