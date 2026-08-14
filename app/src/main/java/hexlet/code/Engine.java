package hexlet.code;
import java.util.Scanner;

class Engine {
    public static void play(Game game, String userName) {
        int round = 0;
        boolean gameOver = false;
        while (!gameOver && round < 3) {
            String question = game.getQuestion();
            System.out.println("Question: " + question);
            String userAnswer = getAnswer();
            System.out.println("Your answer: " + userAnswer);
            String correctAnswer = game.getCorrectAnswer();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                round = round + 1;
            } else {
                System.out.println("'" + userAnswer
                        + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                gameOver = true;
            }
        }
        if (round == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static String getAnswer() {
        Scanner answer = new Scanner(System.in);
        return answer.nextLine();
    }
}
