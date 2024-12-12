/*
 *	Author:  Spursh Deshpande
 *  Date: 8/29/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first int:");
		int firstInt = scanner.nextInt();
		
		System.out.println("Enter your second int:");
		int secondInt = scanner.nextInt();
		
		if(firstInt != secondInt) {
			System.out.println("Values are different");
		} else {
			System.out.println("Values are same");
		}
	}
}
