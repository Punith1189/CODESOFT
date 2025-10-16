package Task_1.com;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		        int randomNumber = (int) (Math.random() * 100) + 1;

		        Scanner scanner = new Scanner(System.in);

		        boolean guessedCorrectly = false;
		        int numberOfAttempts = 0;
		        System.out.println("Guess a number between 1 and 100: "
		        		+ "\nSystem Generated Number is "+randomNumber);

		        
		        while (!guessedCorrectly && numberOfAttempts < 3) 
		        {
		           
		            int userGuess = scanner.nextInt();

		            if (userGuess == randomNumber) 
		            {
		                guessedCorrectly = true;
		            } 
		            else 
		            {
		                numberOfAttempts++;
		                if (userGuess > randomNumber) 
		                {
		                    System.out.println("Your guess is too high.");
		                } else 
		                {
		                    System.out.println("Your guess is too low.");
		                }
		            }
		        }
		        scanner.close();

		        if (guessedCorrectly) 
		        {
		            System.out.println("Congratulations! You guessed correctly! The number was " + randomNumber);
		        } else 
		        {
		            System.out.println("Sorry, you ran out of guesses. The correct answer was " + randomNumber);
		        }	
	}

}