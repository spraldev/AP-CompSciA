/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner scanner = new Scanner(System.in);
		int num = (int) (Math.random() * 1000) + 1;
		
		System.out.print("Enter your guess: ");
		int guess = scanner.nextInt();
		
		while (guess != num) {
			if(guess > num) {
				System.out.println("Incorrect! That's too high. Enter your next guess:");
			} else {
				System.out.println("Incorrect! That's too low. Enter your next guess:");
			}
			
			guess = scanner.nextInt();
		}
		
		System.out.println("Yes, your number was " + num + " :DD");


		
	}
}
