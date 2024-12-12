/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What symbol would you like to use? ");
		
		String Symbol = scanner.nextLine();
		
		System.out.println("What is the height of the box? ");
		
		int height = scanner.nextInt();
		
		System.out.println("What is the width of the box? ");
		
		int width = scanner.nextInt();
		
		
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(Symbol);
			}
			
			System.out.print("\n");
		}

		
	}
}
