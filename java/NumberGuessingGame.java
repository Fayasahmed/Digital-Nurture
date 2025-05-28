import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        Scanner scanner = new Scanner(System.in);

        do {
            guess = 50; // Example guess
            if (guess < numberToGuess)
                System.out.println("Too low!");
            else if (guess > numberToGuess)
                System.out.println("Too high!");
        } while (guess != numberToGuess);

        System.out.println("Correct! The number was " + numberToGuess);
        scanner.close();
    }
}