package hexlet.code.games;
import hexlet.code.Game;
import java.util.Random;

public class Progression implements Game {
    private int start;
    private int step;
    private int current;
    private int hiddenIndex;
    public String getSequence() {
        Random random = new Random();
        hiddenIndex = random.nextInt(10);
        step = random.nextInt(1, 5);
        start = random.nextInt(1, 5);
        StringBuilder sequence = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            current = start + index * step;
            if (index == hiddenIndex) {
                sequence.append(".." + " ");
            } else {
                sequence.append(current + " ");
            }
        }
        return sequence.toString();
    }
    public String getCorrectAnswer() {
        int result = start + hiddenIndex * step;
        return String.valueOf(result);
    }
    public String getQuestion() {
        return getSequence();
    }
}
