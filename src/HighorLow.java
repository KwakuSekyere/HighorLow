import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1; //
        int userGuess;

        System.out.println("I've picked a number between 1 and 10. Can you guess it?");
        System.out.print("Enter your guess: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer between 1 and 10:");
            scanner.next(); //
        }
        userGuess = scanner.nextInt();

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the number correctly: " + randomNumber);
        } else {
            System.out.println("Sorry, the correct number was: " + randomNumber);
        }
    }
}
