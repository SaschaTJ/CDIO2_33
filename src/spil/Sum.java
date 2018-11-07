package spil;

public class Sum {
    private int sum;
    Dice dice = new Dice();

    public int totalSum() {
        this.sum = dice.getEyes() + dice.getEyes();
        return sum;
    }
}

