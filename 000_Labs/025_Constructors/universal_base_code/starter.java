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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like your role to be?\n");
		System.out.println("[w]-Wizard");
		System.out.println("[wa]-Warrior");
		System.out.println("[r]-Rogue");
		
		String role = scanner.nextLine();
		

		
		switch(role.toLowerCase()) {
		  case "w":
		  	role = "Wizard";
		    break;
		  case "wa":
		    role = "Warrior";
		    break;
		  case "r":
		    role = "Rogue";
		    break;
		    
		  default:
			System.out.println("Invalid Role! Please Re-Run this program");
			return;
			
		}
		
		myCharacter empty = new myCharacter();
		myCharacter full = new myCharacter(role);
	}
}
