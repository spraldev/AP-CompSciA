/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your guess");
		
		int guess = scanner.nextInt();
		int randomNum = (int) (Math.random() * 1000)  + 1;
		
		if(guess == randomNum) {
			System.out.println("You are right :D");
		} else if (guess > randomNum) {
			System.out.println("That is too high... (actual #: " + randomNum + ")");
		} else if (guess < randomNum) {
			System.out.println("That is too low... (actual #: " + randomNum + ")");
		}
	}
}
