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
        int index = -1;
        for (int i=0; i<guesses.length; i++) {
            if(guesses[i] == 0) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            guesses[index] = guess;
        }
    }

    public int getGuess() {
        int guess = 0;
        Random random = new Random();
        guess = random.nextInt(100) + 1;
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
