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
		
		System.out.print("Please enter a phrase: ");
		
		String phrase = scanner.nextLine();
		
		String[] parts = phrase.split(" ");
		
		String[] revParts = new String[parts.length];
		
		
		int j = 0;
		
        for (int i = parts.length - 1; i >= 0; i--) {
            revParts[j] = parts[i];
            j++;
        }
		
		
		System.out.println(String.join(" ", revParts));
		
		
	}
}
