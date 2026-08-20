package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String example() {
        String userName = getName();
        return userName;
    }
    public static String getName() {
        Scanner user = new Scanner(System.in);
        return user.nextLine();
    }
}



class ChooseGame {
    public static void choose() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - Nod");
        System.out.println("0 - Exit");
        int resultUserChoice = getChoose();
        System.out.println("Your choice: " + resultUserChoice);
        String userName;
        if (resultUserChoice == 1 || resultUserChoice == 2 || resultUserChoice == 3 || resultUserChoice == 4) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            userName = Cli.example();
            System.out.println("Hello, " + userName + "!");
            if (resultUserChoice == 2) {
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Game even = new Even();
                Engine.play(even, userName);
            }
            if (resultUserChoice == 3) {
                System.out.println("What is the result of the expression?");
                Game calc = new Calc();
                Engine.play(calc, userName);
            }
            if (resultUserChoice == 4) {
                System.out.println("Find the greatest common divisor of given numbers.");
                Game nod = new Nod();
                Engine.play(nod, userName);
            }
        } else if (resultUserChoice == 0) {
            System.exit(0);
        } else {
            System.out.println("invalid value");
            choose();
        }
    }
    public static int getChoose() {
        Scanner number = new Scanner(System.in);
        return number.nextInt();
    }
}
