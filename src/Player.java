import java.util.ArrayList;

public abstract class Player {
    private String name;
    protected static ArrayList<Integer> guesses;


    public Player(String name) {
        this.name = name;
        guesses = new ArrayList<>();
    }


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }



    public int getGuess() {
        if (!guesses.isEmpty()) {
            return guesses.getLast();
            }
        return 101;
    }

    public abstract String chooseOption();
    public abstract void makeGuess(int guess);


    public static String turnsWinner(String playerOneOption, String playerTwoOption) {
        if (playerOneOption.equals(playerTwoOption)) {
            return "Tie";
        } else if ((playerOneOption.equals("rock") && playerTwoOption.equals("scissors")) ||
                (playerOneOption.equals("scissors") && playerTwoOption.equals("paper")) ||
                (playerOneOption.equals("paper") && playerTwoOption.equals("rock"))) {
            return "Player One";
        } else {
            return "Player Two";
        }
    }
}
