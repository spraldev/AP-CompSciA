/*
 *	Author:  
 *  Date: 
*/

import pkg.myCharacter;

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your role: ");
		String role = scanner.nextLine();
		
		System.out.print("Enter your Strength: ");
		int Strength = scanner.nextInt();
		
		System.out.print("Enter your Dexterity: ");
		int Dexterity = scanner.nextInt();
		
		System.out.print("Enter your Charisma: ");
		int Charisma = scanner.nextInt();
		
		System.out.print("Enter your Intelligence: ");
		int Intelligence = scanner.nextInt();
		
		System.out.println("\n-------------\n");
		
		myCharacter spursh = new myCharacter(role, Strength, Dexterity, Charisma, Intelligence);
		
		spursh.tostring();
		
		
	}
}
