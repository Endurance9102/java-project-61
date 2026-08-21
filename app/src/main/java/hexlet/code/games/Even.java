package hexlet.code.games;
import hexlet.code.Game;
import java.util.Random;





public class Even implements Game {
    private int randomNumber;

    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        return randomNumber;
    }
    public String getQuestion() {
        randomNumber = getRandomNumber();
        return String.valueOf(randomNumber);
    }

    public String getCorrectAnswer() {
        if (randomNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}



