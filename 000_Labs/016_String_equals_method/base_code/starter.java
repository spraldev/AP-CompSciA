/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int randomNum = (int) (Math.random() * 3) + 1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you want to be, a Wizard, Warrior, or a Rouge?");
		String userRole = scanner.nextLine();
		
		switch(randomNum) {
			case 1:
				if(userRole.equalsIgnoreCase("wizard")) {
					System.out.println("That's correct! You are a Wizard :D");
				} else {
					System.out.println("Thats's incorrect! You are actually a Wizard D:");
				}
			break;
			
			case 2:
				if(userRole.equalsIgnoreCase("warrior")) {
					System.out.println("That's correct! You are a Warrior :D");
				} else {
					System.out.println("Thats's incorrect! You are actually a Warrior D:");
				}
			break;
			
			case 3:
				if(userRole.equalsIgnoreCase("rouge")) {
					System.out.println("That's correct! You are a Rouge :D");
				} else {
					System.out.println("Thats's incorrect! You are actually a Rouge D:");
				}
			break;
			
			
			
		}
	}
}
