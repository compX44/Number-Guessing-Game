// A number guessing game using the random number generator

// Import additional functions
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// Declare game variables
		int correctAnswer, playerGuess, lives;
		final int MIN = 1;
		final int MAX = 50;
		String name, playResponse;
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
	
		lives = 5;	
		
		// Asks for the player's name
		System.out.println("Please enter your name.");
		name = scanner.nextLine();
		
		// Greeting and rules explanation
		System.out.println("Welcome " + name + ".");
		System.out.println("This is a number guessing game. Guess the number and you win. Guess incorrectly, you will lose a life.");
		System.out.println("If you lose all your lives, you will lose.");
						
		// Generates a number between 1 and 100 inclusive
		correctAnswer = rand.nextInt((MIN), (MAX + 1));
		
		// Asks for player input
		System.out.println("Please guess a number between " + MIN + " and " + MAX + ".");
		playerGuess = scanner.nextInt(); 
		
		answerChecker(correctAnswer, playerGuess, lives);
		
		System.out.println("Thanks for playing.");
		
		}
	
	// Checks player's guess with the generated number
	public static void answerChecker(int answer, int guess, int playerLives) {
		Scanner scanner = new Scanner(System.in);
		
		while (playerLives > 1) {
			
			if ((guess == answer)){
				System.out.println("Congratulations! You've guessed the correct number!");
				break;
			}
			
			if (guess > 50) {
				System.out.println("Invalid input! Please enter numbers in between 1 - 50!");
				}
			
			else {
					System.out.println("Sorry, try again.");
					playerLives -=1;
					System.out.println("You have " + playerLives + " lives left.");
					
					if ((guess != answer) && (answer < 10)) {
						System.out.println("Here's a hint: the answer is less than 10.");
					}
					
					else if ((guess != answer) && ((answer >= 10) && (answer < 25))){
						System.out.println("Here's a hint: the answer is greater than 10, but less than 25.");
					}
					
					else {
						System.out.println("Here's a hint: the answer is 25 or greater.");
					}
					
				}
			
			
			guess = scanner.nextInt();
			
			if (playerLives == 1) {
				System.out.println("You have run out of lives. The correct answer is: " + answer + ". Better luck next time.");
			}
		}
	}
}
		

	
