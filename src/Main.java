public class Main {
    public static void main(String[] args) {
        PlayerOne playerOne = new PlayerOne("");
        playerOne.inputName();

        String playerTwoName = "Ducky Debuggie";
        //PlayerTwo playerTwo = new PlayerTwo(playerTwoName);

        if (!playerOne.getName().isEmpty()) {
            System.out.println("Welcome " + playerOne.getName() + "! My name is: " + playerTwoName);
            playerOne.inputReady();
        }

        System.out.println("I am the system, I generated a number from 1 to 100. If you guess it, you will win."); //+ "\n" + "But if you don't guess it, it will be Ducky Debuggie's turn to guess, until one of you wins." + "\n" + "Don´t Worry, I'll give you hints along the way.");

        GuessTheNumber play = new GuessTheNumber();
        int targetNumber = play.getTargetNumber();
        System.out.println("The random number is ready, so you must do your guess.");
        boolean isCorrectGuess = false;

        while (!isCorrectGuess) {
            playerOne.inputGuess();
            isCorrectGuess = play.checkGuess(targetNumber, playerOne.getGuess());
            if (isCorrectGuess) {
                System.out.println("PlayerOne´s guess is correct: " + isCorrectGuess);
            } else {
                System.out.println("Try again");
            }
        }

    }
}