import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            PlayerOne playerOne = new PlayerOne("");
            playerOne.inputName();
            PlayerTwo playerTwo = new PlayerTwo("Ducky Debuggie");
            String winnerName = "NoOne";
            String winner = "";

            while (winner.isEmpty() || winner.equals("Tie")) {
                if (!playerOne.getName().isEmpty()) {
                    System.out.println("Welcome " + playerOne.getName() + "! My name is: " + playerTwo);
                    String playerOneOption = playerOne.chooseOption();
                    String playerTwoOption = playerTwo.chooseOption();
                    winner = Player.turnsWinner(playerOneOption, playerTwoOption);


                    if (winner.equals("Tie")) {
                        System.out.println("It's a tie!");
                    } else if (winner.equals("Player One")) {
                        System.out.println(playerOne.getName() + " wins!");
                        winnerName= playerOne.getName();
                    } else {
                        System.out.println(playerTwo + " wins!");
                        winnerName= String.valueOf(playerTwo);
                    }
                }
            }

        System.out.println("I am the system, I generated a number from 1 to 100. If you guess it, you will win." + "\n" + "But if you don't guess it, it will be Ducky Debuggie's turn to guess, until one of you wins." + "\n" + "Don´t Worry, I'll give you hints along the way.");
        playerOne.inputReady();
        Player currentPlayer = (winnerName.equals(playerOne.getName())) ? playerOne : playerTwo;
        
        GuessTheNumber play = new GuessTheNumber();
        int targetNumber = play.getTargetNumber();
        System.out.println("The random number is ready. It is " + winnerName + " turn.");

        boolean isCorrectGuess = false;

        while (!isCorrectGuess) {
            int currentGuess;
            if (currentPlayer == playerOne) {
                playerOne.inputGuess();
                currentGuess = currentPlayer.getGuess();
            } else {
                currentGuess = currentPlayer.getGuess();
            }
            isCorrectGuess = play.checkGuess(targetNumber, currentGuess) ;
            winnerName = currentPlayer.getName();

            if (!isCorrectGuess) {
                if (targetNumber > currentGuess) {
                    System.out.println("Try again, must be a higher number");
                } else if (targetNumber < currentGuess) {
                    System.out.println("Try again, it should be a lower number");
                }
            }
           currentPlayer = (currentPlayer == playerOne) ? playerTwo: playerOne;

        }
        System.out.println(winnerName + " Your guess is correct: " + targetNumber);
        System.out.println(Arrays.toString(new ArrayList[]{Player.guesses}));
    }
}

