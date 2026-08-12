package hexlet.code;
import java.util.Random;
import java.util.Scanner;




class Even {
    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        return randomNumber;
    }

    public static void play(String userName) {
        int round = 0;
        boolean gameOver = false;
        while (!gameOver && round < 3) {
            int randomNumber = getRandomNumber();
            System.out.println("Question: " + randomNumber);
            String userAnswer = getAnswer();
            System.out.println("Your answer: " + userAnswer);
            String correctAnswer;
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (correctAnswer.equals(userAnswer)) {
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

