package spil;

public class Account {
    private int score = 1000;

    public Account() {

    }

    public void addToScore(int result) {
        if (this.score + result < 0) {
            this.score = 0;
        } else {
            this.score += result;
        }

    }

    public int getScore() {
        return this.score;
    }
}