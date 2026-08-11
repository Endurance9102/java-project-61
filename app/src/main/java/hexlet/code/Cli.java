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
