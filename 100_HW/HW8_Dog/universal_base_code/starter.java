/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog dog1 = new Dog("Doggy", 2);
		Dog dog2 = new Dog("Wolfy", "Wolf");
		
		if(dog1.isSleeping()) {
			System.out.println("asleep");
		} else {
			dog1.bark();
			dog2.bark();
		}
		



	}
}
