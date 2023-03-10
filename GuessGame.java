package homework3;
import java.lang.Math;
import java.util.Scanner;

public class GuessGame {
	
	public static void main(String[] args) {

		int TRY=0,guess=-1,play=1,answer=-1;
		Scanner input = new Scanner(System.in);
		System.out.println("***Welcome to the Guess Game!***");

		here: while (play==1){ //if the user wants to play multiple times
			
		answer = (int) (Math.random()*100);
		System.out.println("Try to guess the random number:)");
		System.out.println("********************************");
		
		do {					//to make sure that number is between 1 and 100
		System.out.println("Please write a number between 1 and 100 to start: ");
		guess = input.nextInt();
		}
		while (number(guess)!=true);
		
		TRY++;  //For the first try 
		
		while (guess != answer) {
			
			if (guess > answer) {
				System.out.println("Too high, try again :) \n**(-1 to exit)**");
				TRY++;
				guess = input.nextInt();
				if (guess ==-1)		//if the user wants to leave the game
					break here;
			}
			
			if (guess < answer) {
				System.out.println("Too low, try again :( \n**(-1 to exit)**");
				TRY++;
				guess = input.nextInt();
				if (guess ==-1)
					break here;
			}
			
			}
		
		System.out.println("Congratulations! You guessed the number "+answer+" with "+TRY+" guesses :)");		
		System.out.println("If you want to play again press 1: ");
		play = input.nextInt();
		}
		if(guess ==-1)	
			System.out.println("Number was "+ answer);
		
		System.out.println("See you next time :)");
		input.close();	
	}
	
	public static boolean number(int guess) {
		if (guess>=0 && guess <=100) {
			return true;
		}
		else {
			System.out.println("Invalid number!");
			return false;
		}
		}
			
	}

