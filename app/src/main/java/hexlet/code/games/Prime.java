package hexlet.code.games;
import hexlet.code.Game;
import java.util.Random;

public class Prime implements Game {
    private int randomNumber;
    public String getQuestion() {
        Random random = new Random();
        randomNumber = random.nextInt(100);
        return String.valueOf(randomNumber);
    }

    private boolean getFindCurrect() {
        if (randomNumber < 2) {
            return false;
        } else if (randomNumber == 2) {
            return true;
        } else if (randomNumber % 2 == 0) {
            return false;
        }
        int x = 3;
        while (x <= Math.sqrt(randomNumber)) {
            if (randomNumber % x == 0) {
                return false;
            } else {
                x = x + 2;
            }
        }
        return true;
    }

    public String getCorrectAnswer() {
        if (getFindCurrect()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
