/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first int: ");
		int int1 = scanner.nextInt();
		
		System.out.println("Enter your second int: ");
		int int2 = scanner.nextInt();
		
		System.out.println("Enter your third int: ");
		int int3 = scanner.nextInt();
		
		
		if(int1 > int2) {
			if(int1 > int3) {
				System.out.println(int1 + " is the largest int :D");
			} else {
				System.out.println(int3 + " is the largest int :D");
			}
		} else {
			if(int2 > int3) {
				System.out.println(int2 + " is the largest int :D");
			} else {
				System.out.println(int3 + " is the largest int :D");
			}
		}
		
		if(int1 < int2) {
			if(int1 < int3) {
				System.out.println(int1 + " is the smallest int :D");
			} else {
				System.out.println(int3 + " is the smaller int :D");
			}
		} else {
			if(int2 < int3) {
				System.out.println(int2 + " is the smallest int :D");
			} else {
				System.out.println(int3 + " is the smallest int :D");
			}
		}
		
	}
}
