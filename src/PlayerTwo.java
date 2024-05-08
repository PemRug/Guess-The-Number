import java.util.Collections;
import java.util.Random;


public class PlayerTwo extends Player {

    public PlayerTwo(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void makeGuess(int guess) {
        if (guesses.size() < 100) {
            guesses.add(guess);
        }
    }

    public int getGuess() {
        int guess = 0;
        GuessTheNumber guessGame = new GuessTheNumber();
        Random random = new Random();
        if (!guesses.isEmpty()) {
            int lastGuess = Collections.max(guesses);
            if (guess < guessGame.getTargetNumber()) {
                guess = random.nextInt(lastGuess -1) + 1;
            } else {
                guess = random.nextInt(100 -lastGuess)+ lastGuess+ 1;
            }
        } else  {
            guess = random.nextInt(100) + 1;

        }
        guesses.add((guess));
        System.out.println(guess);
        return guess;
    }

    @Override
    public String chooseOption() {
        Random random = new Random();
        int indexOption = random.nextInt(3);
        String[] options = {"rock", "paper", "scissors"};
        return options[indexOption];
    }
}
