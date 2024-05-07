import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConcretePlayer extends Player {
    public ConcretePlayer(String name) {
        super(name);
    }

    @Override
    public String chooseOption() {
        return "";
    }

    @Override
    public void makeGuess(int guess) {
    }
}

class PlayerTest {

    @DisplayName("getGuessTest: Return the guess in the actual position")
    @Test
    void getGuessTest() {
        ConcretePlayer getGuessPlayer = new ConcretePlayer("");
        PlayerOne player = new PlayerOne("");
        player.makeGuess(10);
        player.makeGuess(3);
        player.makeGuess(5);

        int guess = getGuessPlayer.getGuess();
        assertEquals(5, guess);
    }

    @DisplayName("getGuess error 101")
    @Test
    void getGuessTest1() {
        ConcretePlayer getGuessPlayer = new ConcretePlayer("");
        PlayerOne player = new PlayerOne("");
        player.makeGuess(0);
        player.makeGuess(0);
        player.makeGuess(0);

        int guess = getGuessPlayer.getGuess();
        assertEquals(101, guess);
    }

    @DisplayName("turnsWinnerTest1: Return the winner Player Two")
    @Test
    void turnsWinnerTest1() {
        String optionRock = "rock";
        String optionPaper = "paper";
        String winner = Player.turnsWinner(optionRock, optionPaper);
        assertEquals("Player Two", winner);
    }
    @DisplayName("turnsWinnerTest2: Return the winner Player One")
    @Test
    void turnsWinnerTest2() {
        String optionRock = "paper";
        String optionPaper = "rock";
        String winner = Player.turnsWinner(optionRock, optionPaper);
        assertEquals("Player One", winner);
    }
    @DisplayName("turnsWinnerTest3: Return Tie")
    @Test
    void turnsWinnerTest3() {
        String optionRock = "paper";
        String optionPaper = "paper";
        String winner = Player.turnsWinner(optionRock, optionPaper);
        assertEquals("Tie", winner);
    }
    @DisplayName("turnsWinnerTest4: Return the winner Player One")
    @Test
    void turnsWinnerTest4() {
        String optionRock = "rock";
        String optionPaper = "scissors";
        String winner = Player.turnsWinner(optionRock, optionPaper);
        assertEquals("Player One", winner);
    }
    @DisplayName("turnsWinnerTest5: Return the winner Player Two")
    @Test
    void turnsWinnerTest5() {
        String optionRock = "scissors";
        String optionPaper = "rock";
        String winner = Player.turnsWinner(optionRock, optionPaper);
        assertEquals("Player Two", winner);
    }
    @DisplayName("turnsWinnerTest6: Return the winner Player One")
    @Test
    void turnsWinnerTest6() {
        String optionRock = "scissors";
        String optionPaper = "paper";
        String winner = Player.turnsWinner(optionRock, optionPaper);
        assertEquals("Player One", winner);
    }
    @DisplayName("turnsWinnerTest7: Return the winner Player Two")
    @Test
    void turnsWinnerTest7() {
        String optionRock = "paper";
        String optionPaper = "scissors";
        String winner = Player.turnsWinner(optionRock, optionPaper);
        assertEquals("Player Two", winner);
    }

    @DisplayName("getNameTest")
    void getNameTest() {
        String playerName = "Jane Doe";
        ConcretePlayer player = new ConcretePlayer(playerName);
        String name = player.getName();
        assertEquals(playerName, name);
    }

    @DisplayName("setNameTest: Set the name of the player")
    @Test
    void setNameTest() {
        ConcretePlayer player = new ConcretePlayer("");
        String newName = "Jane Doe";
        player.setName(newName);
        String name = player.getName();
        assertEquals(newName, name);
    }
}



