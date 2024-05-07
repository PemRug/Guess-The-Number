import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GuessTheNumberTest {

    @DisplayName("getTargetNumberTest: Return true, if the random number is > 1 and < 100")
    @Test
    void getTargetNumberTest() {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        int generateNumber =  guessTheNumber.getTargetNumber();
        assertTrue(generateNumber >=1 && generateNumber <=100);
    }

    @DisplayName("checkGuessTest: Return true, if the target number is the same of the Guess")
    @Test
    void checkGuessTest() {
        GuessTheNumber guessGame = new GuessTheNumber();
        int targetNumber = 5;
        int guessEqual = 5;
        int guessBigger =40;
        int guessShorter = 1;

        assertTrue(guessGame.checkGuess(targetNumber,guessEqual));
        assertFalse(guessGame.checkGuess(targetNumber,guessBigger),  "The Number is too big");
        assertFalse(guessGame.checkGuess(targetNumber,guessShorter), "The Number is too short");
    }
}