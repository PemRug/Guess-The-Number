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
        String answer = "";
        boolean validAnswer = false;

        while (!validAnswer) {
            System.out.println("Are you ready? (yes/no)");
            answer = scanner.nextLine().toLowerCase();
            if (answer.equals("yes")) {
                validAnswer = true;
            } if (answer.equals("no")) {
                System.out.println("Enter yes when you are ready");
            }
        }
        System.out.println("Perfect! Let´s start");
    }

    @Override
    public String chooseOption() {
        Scanner scanner = new Scanner(System.in);
        String option= "";
        boolean validOption = false;

        while (!validOption) {
            System.out.println("Choose your option: rock, paper, or scissors");
            option = scanner.nextLine().toLowerCase();
            if (option.equals("rock")||option.equals("paper")||option.equals("scissors")) {
                validOption=true;
            } else {
                System.out.println("Enter a valid option");
            }
        }
        return option;
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

}
