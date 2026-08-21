package hexlet.code.games;
import hexlet.code.Game;
import java.util.Random;

public class Calc implements  Game {
    private int randomNumber1;
    private int randomNumber2;
    private String operation;

    public String getQuestion() {
        Random random = new Random();
        randomNumber1 = random.nextInt(1000);
        randomNumber2 = random.nextInt(1000);
        int operationNumber = random.nextInt(3);
        switch (operationNumber) {
            case 0:
                operation = "+";
                break;
            case 1:
                operation = "-";
                break;
            case 2:
                operation = "*";
                break;
            default:
                throw new IllegalStateException("Unknown operation");
        }
        return randomNumber1 + " " + operation + " " + randomNumber2;
    }

    public String getCorrectAnswer() {
        int result = 0;
        switch (operation) {
            case "+":
                result = randomNumber1 + randomNumber2;
                break;
            case "-":
                result = randomNumber1 - randomNumber2;
                break;
            case "*":
                result = randomNumber1 * randomNumber2;
                break;
            default:
                throw new IllegalStateException("Unknown operation");
        }
        return String.valueOf(result);
    }
}

