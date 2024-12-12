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
		
		Apprentice empty = new Apprentice();
		empty.playInstrument();
		
		Apprentice app1 = new Apprentice("Stanford", 5);
		
		app1.practice();
		
		Apprentice app2 = new Apprentice("Paino", "Harvard", 3);
		
		app2.perform();
		
		Apprentice app3 = new Apprentice("Ben Dover", 19, "Violin", "Columbia", 4);
		
		app3.practiceAtUniversity();
		
		
		


		
	}
}
