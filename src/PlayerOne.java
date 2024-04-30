import java.util.Scanner;

public class PlayerOne extends Player {
    public PlayerOne (String name) {
        super(name);
    }

    public void inputName( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set your name: ");
        setName(scanner.nextLine());
    }

    public void inputReady( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready?");
        setReady(scanner.nextLine());
        System.out.println("Perfect! Let´s start");
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

    public void inputGuess() {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        try {
            guess = Integer.parseInt(scanner.nextLine());
            if (guess < 1 || guess > 100) {
                System.out.println("Not valid number");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
            return;
        }
        makeGuess(guess);
    }


    public int getGuess() {
        return guesses[guesses.length - 1];
    }
}
