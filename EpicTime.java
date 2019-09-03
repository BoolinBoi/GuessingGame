//still need to get input/scanner stuff
//set up player 1 and player 2 system
//when one of them wins set their variable to 1, and then set i to 5
//then print a victory message for whichever player has 1 as their variable
//if neither have it then print nobody wins message
import java.util.Scanner;
public class EpicTime 
{
	public static void main(String[] args)
	{
		//generating the two random numbers
		double randoOne = (int)(Math.random()*((99+0)+1))+0;	
		double randoTwo = (int)(Math.random()*((99+0)+1))+0;	
		
		//generates thigns necesarry for the loop and determining which player wins
		System.out.println("The program is generating a random number between 1 and 100. Try to guess the number!");
		char i = 'n';
		int n = 0;
		int playerOneGuesses = 0;
		int playerTwoGuesses = 0;
		Scanner keyboard = new Scanner(System.in);
		int playerOne = 0;
		int playerTwo = 0;
		//while loop that processes the players' guesses and calculates wether they are higher, lower, or correct
		while (i != 'y')
		{
			System.out.println("Player 1, what's your guess?");
			int playerOneGuess = keyboard.nextInt();
			System.out.println("Player 2, what's your guess?");
			int playerTwoGuess = keyboard.nextInt();
			if (playerOneGuess > randoOne)
			{
				System.out.println("Player one's guess is too high.");
			}
			else if (playerOneGuess < randoOne)
			{
				System.out.println("Player one's guess is too low.");
			}
			else if (playerOneGuess == randoOne)
			{
				System.out.println("Congratulations player 1, You guessed correctly!");
				playerOne = 1;
				i = 'y';
			}
			if (playerTwoGuess > randoTwo)
			{
				System.out.println("Player two's guess is too high.");
			}
			else if (playerTwoGuess < randoTwo)
			{
				System.out.println("Player two's guess is too low.");
			}
			else if (playerTwoGuess == randoTwo)
			{
				System.out.println("Congratulations player 2, You guessed correctly!");
				playerTwo = 1;
				i = 'y';
			}
			n += 1;
		}	
		//prints out victory statements and tier
		if (playerOne == 1)
		{
			System.out.println("Congratulations player 1, you won!");
		}
		if (playerTwo == 1)
		{
			System.out.println("Congratulations player 2, you won!");
		}
		if (n <= 2)
		{
			System.out.println("You got it right in " + n +"guess(es). S tier!");
		}
		else if (n <= 5)
		{
			System.out.println("You got it right in " + n + "guesses. A tier.");
		}
		else if (n <= 8)
		{
			System.out.println("You got it right in " + n + "guesses. B tier.");
		}
		else
		{
			System.out.println("It took you " + n + " guesses. garbo tier.");
		}
	}
	
}
