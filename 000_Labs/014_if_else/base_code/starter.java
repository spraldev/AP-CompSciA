/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your guess");
		
		int guess = scanner.nextInt();
		int randomNum = (int) (Math.random() * 1000)  + 1;
		
		if (guess == randomNum) {
			System.out.println("You're correct :D");
		} else {
			System.out.println("You're incorrect :( (Correct #: " + randomNum + ")");
		}
		
	}
}
