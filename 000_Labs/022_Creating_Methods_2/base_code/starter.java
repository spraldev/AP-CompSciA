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
		
		System.out.println("Please enter x: ");
		int x = scanner.nextInt();
		
		System.out.println("Please enter y: ");
		int y = scanner.nextInt();
		
		System.out.println(pow(x,y));

		
	}
	
	public static int pow(int x, int y) {
		int num = 1;
		int count = 0;
		
		while (count < y) {
			num = num * x;
			count++;
		}
		
		return num;
	}
}
