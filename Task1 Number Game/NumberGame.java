package numberGame.com;
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();  
        int roundsPlayed = 0;
        int roundsWon = 0;
        while (true) {
            roundsPlayed++;
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 10; 
            System.out.println("\nRound " + roundsPlayed);
            System.out.println("Guess the number between 1 and 100. You have " + attempts + " attempts.");
            boolean guessedCorrectly = false;
            while (attempts > 0 && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number!");
                    guessedCorrectly = true;
                    roundsWon++;
                } else if (userGuess < numberToGuess) {
                    System.out.println(" too low.");
                } else {
                    System.out.println(" too high.");
                }
                attempts--; 
                if (!guessedCorrectly) {
                    System.out.println("You have " + attempts + " attempts left.");
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
            }
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (playAgain.equals("no")) {
                break;
            }
        }
        System.out.println("\nGame Over! You played " + roundsPlayed + " rounds and won " + roundsWon + " rounds.");
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
