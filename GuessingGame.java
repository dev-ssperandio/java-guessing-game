import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // The program choose a random number between 1 and 100.
        int randomNumber = random.nextInt(100) + 1;

        // The player has to guess what the random number is within a limited number of attempts.
        int attempts = 5;
        while (attempts > 0) {
            System.out.print("Guess the number: ");
            int userNumber = scanner.nextInt();

            if (userNumber == randomNumber) {
                System.out.println("Winner! You guessed the number!");
                break;
            }
            else
                System.out.println("Try again! You don't guessed the number!\n");

            attempts--;
        }

        System.out.println("The random number is: " + randomNumber);

        if (attempts == 0)
            System.out.println("You lost all attempts!");

        scanner.close();
    }
}