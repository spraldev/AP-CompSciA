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
		
		System.out.println("Please type a word: ");
		
		String word = scanner.nextLine();
		
		System.out.println("\n");
		
		
		
		for(int i = 0; i < word.length(); i++) {
			System.out.print(word.substring((i), (i+ 1)) + " ");
		}
		
		System.out.println("\n---Every Letter on a new line---\n");
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.substring((i), (i+ 1)));
		}
		
	}
}
