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
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("Enter your number");
		int num = scanner.nextInt();

		
		int count = 0;
		
		System.out.println("----------------");
		
		while (count < num) {
			System.out.println((count + 1) + "." + name);
			count++;
		}
		
		System.out.println("Done :DD");
		
		


		
	}
}
