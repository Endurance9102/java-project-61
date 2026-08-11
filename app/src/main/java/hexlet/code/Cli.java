package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void example() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        System.out.println("Hello, " + getName() + "!");
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
        System.out.println("0 - Exit");
        int resultUserChoice = getChoose();
        System.out.println("Your choice: " + resultUserChoice);
        if (resultUserChoice == 1) {
            Cli.example();
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
