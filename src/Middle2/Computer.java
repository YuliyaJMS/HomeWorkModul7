package Middle2;

public class Computer {
    private int secretNumber;

    public void generateNumber(int min, int max) {
        secretNumber = (int) (Math.random() * (max - min + 1) + min);

    }

    public boolean checkGuess(int guess) {
        return guess == secretNumber;

    }

    public String getHint(int guess) {
        if (guess > secretNumber) {
            return "больше";
        } else if (guess < secretNumber) {
            return "меньше";
        } else {
            return "угадал";
        }
    }

    public int getSecretNumber() {
        return secretNumber;
    }
}
