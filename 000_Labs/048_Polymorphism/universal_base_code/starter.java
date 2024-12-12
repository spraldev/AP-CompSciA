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
		
		Performer [] array = new Performer[4];
		
		array[0] = new Performer();
		array[1] = new Musician();
		array[2] = new Apprentice();
		array[3] = new Actor();
		
		array[0].perform();
		array[0].practice();
		
		((Musician) array[1]).perform();
		((Musician) array[1]).practice();
		
		((Apprentice) array[2]).practiceAtUniversity();
		((Apprentice) array[2]).playInstrument();
		
		((Actor) array[3]).monologue();
		((Actor) array[3]).perform();
		
		


		
	}
}
