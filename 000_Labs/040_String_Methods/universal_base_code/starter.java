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
		
		System.out.print("Please enter your full name :D ");
		
		String name = scanner.nextLine();
		
		int index = name.indexOf(" ");
		int length = name.length();
		
		if(index == -1) {
			System.out.println("There must be a space in your string!");
			return;
		}
		
		System.out.println(name.substring((index + 1), length));
		
		


		
	}
}
