package hexlet.code.games;
import hexlet.code.Game;
import java.util.Random;

public class Nod implements Game {
    private int randomNumber1;
    private int randomNumber2;

    public String getQuestion() {
        Random random = new Random();
        randomNumber1 = random.nextInt(100);
        randomNumber2 = random.nextInt(100);
        return randomNumber1 + " " + randomNumber2;
    }
    public int getNod(int firstNumber, int secondNumber) {
        int imediate = 0;
        while (secondNumber != 0) {
            imediate = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = imediate;
        }
        return firstNumber;
    }
    public String getCorrectAnswer() {
        int result = getNod(randomNumber1, randomNumber2);
        return String.valueOf(result);
    }
}
