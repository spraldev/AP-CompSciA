/*
 *	Author: Spursh Deshpande
 *  Date: 9/30/24
 * 	Collaborator: N/A
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		// In folder 100_HW/HW4_Divisible complete the following:
		// - Create a program that takes in two input integers. 
		// - First check if each of these integers are odd or even. Output if each are or not.
		// - Then check if they're divisible by 3, 4, and 5. Make sure ALL of these are checked.
		// - Otherwise if it's not divisible by all 3, 4, or 5, output that it isn't! Only if all 3!
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("PLease type the first int: ");
		
		int first = scanner.nextInt();
		
		System.out.println("Please type your second int: ");
		
		int second = scanner.nextInt();
		
		if(first % 2 == 0) {
			System.out.println("The first num is even!");
		} else {
			System.out.println("The first num is odd!");
		}
		
		
		if(second % 2 == 0) {
			System.out.println("The second num is even!");
		} else {
			System.out.println("The second num is odd!");
		}
		
		
		
		if(first % 3 == 0) {
			System.out.println("The first is divisible by 3");
		} else if(first % 4 == 0) {
			System.out.println("The first is divisible by 4");
		} else if(first % 5 == 0) {
			System.out.println("The first is divisible by 5");
		} else {
			System.out.println("The first is not divisible by 3, 4, or 5");
		}
		
		
		
		if(second % 3 == 0) {
			System.out.println("The second is divisible by 3");
		} else if(second % 4 == 0) {
			System.out.println("The second is divisible by 4");
		} else if(second % 5 == 0) {
			System.out.println("The second is divisible by 5");
		} else {
			System.out.println("The second is not divisible by 3, 4, or 5");
		}
	}
}
