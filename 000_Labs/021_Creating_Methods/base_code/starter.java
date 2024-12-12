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
		System.out.println("Please input your first string: ");
		String inputstr1 = scanner.nextLine();
		
		System.out.println("Please input your second string: ");
		String inputstr2 = scanner.nextLine();
		
		System.out.println("\nCalling methods\n");
		
		toString(inputstr1);
		toString(inputstr2);
	}
	
	public static void toString(String inputStr) {
		System.out.println(inputStr);
	}
	
	public static void toStringCombined(String string1, String string2) {
		System.out.println(string1 + "" + string2);
	}
}
