/*
 *	Author:  Spursh Deshpande
 *  Date: 9/6/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int points = 20;
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		
		System.out.println("What is your title? Eg: Slayer of dragons");
		String title = scanner.nextLine();
		
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
		  
		  
		System.out.println("You have 20 points... if I were you, I'd use them well (on the following: Strength, Dexterity, Intelligence, and Charisma. )\n");
		
		System.out.print("Strength (1-10): ");
		int strength = scanner.nextInt();
		
		if(strength < 1 || strength > 10) {
			System.out.println("Your number must be less than one but greater than 10. Please Re-Run this program...");
			return;
		}
		
		points -= strength;
		
		System.out.println("You have " + points + " left!");
		
		
		
		System.out.print("Dexterity (1-10): ");
		int dexterity = scanner.nextInt();
		
		if(dexterity < 1 || dexterity > 10) {
			System.out.println("Your number must be less than one but greater than 10. Please Re-Run this program...");
			return;
		}
		
		points -= dexterity;
		
		System.out.println("You have " + points + " left!");
		
		
		
		System.out.print("Intelligence (1-10): ");
		int intelligence = scanner.nextInt();
		
		if(intelligence < 1 || intelligence > 10) {
			System.out.println("Your number must be less than one but greater than 10. Please Re-Run this program...");
			return;
		}
		
		points -= intelligence;
		
		System.out.println("You have " + points + " left!");
		
		
		System.out.print("Charisma (1-10): ");
		int charisma = scanner.nextInt();
		
		if(charisma < 1 || charisma > 10) {
			System.out.println("Your number must be less than one but greater than 10. Please Re-Run this program...");
			return;
		}
		
		points -= charisma;
		
		System.out.println("You have " + points + " left to spend for next time :D");
		
		System.out.println("------------------------------");
		
		System.out.println("You are " + name + ", the " + title + " of CVHS." );
		System.out.println("You're a " + role + " with the following stats: ");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma + "\n");
		System.out.println("Good luck on your quest " + name + "!");
		
	}
}
