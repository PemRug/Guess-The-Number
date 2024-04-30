import java.util.Random;

public class GuessTheNumber {
    public boolean checkGuess;
    private int targetNumber;

    public GuessTheNumber() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
    }

    public int getTargetNumber () {
        return targetNumber;
    }

    public boolean checkGuess(int targetNumber, int guess) {
        return targetNumber == guess;
    }
}
