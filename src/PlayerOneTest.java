import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class PlayerOneTest {

    @org.junit.jupiter.api.Test
    void inputNameTest() {
        String input = "Jane Doe";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PlayerOne player = new PlayerOne("");
        player.inputName();
        assertEquals("Jane Doe", player.getName());
    }

    @org.junit.jupiter.api.Test
    void inputReady() {
        String answer = "yes";
        InputStream in = new ByteArrayInputStream(answer.getBytes());
        System.setIn(in);

        PlayerOne player = new PlayerOne("");
        player.inputReady();
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void chooseOptionRock() {
    String option = "rock";
    InputStream in = new ByteArrayInputStream (option.getBytes());
    System.setIn(in);
    PlayerOne player = new PlayerOne("");
    String optionRock= player.chooseOption();
    assertEquals("rock", optionRock);
    }

    @org.junit.jupiter.api.Test
    void chooseOptionPaper() {
        String option = "paper";
        InputStream in = new ByteArrayInputStream (option.getBytes());
        System.setIn(in);
        PlayerOne player = new PlayerOne("");
        String optionPaper= player.chooseOption();
        assertEquals("paper", optionPaper);
    }

    @org.junit.jupiter.api.Test
    void chooseOptionScissors() {
        String option = "scissors";
        InputStream in = new ByteArrayInputStream (option.getBytes());
        System.setIn(in);
        PlayerOne player = new PlayerOne("");
        String optionScissors= player.chooseOption();
        assertEquals("scissors", optionScissors);
    }
}