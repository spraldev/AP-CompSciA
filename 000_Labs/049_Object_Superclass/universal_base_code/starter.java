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
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println(array[i].toString());
		}
		
		System.out.println(array[1].equals(array[0]));

		
	}
}
