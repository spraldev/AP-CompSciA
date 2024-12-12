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

		Performer dojaCat = new Performer();
		Performer bustinJiber = new Performer("Bustin Jiber", 30);
		
		Musician celloist = new Musician();
		Musician guitarist = new Musician("guitar");
		
		System.out.println(dojaCat.getName());
		dojaCat.practice();
		
		System.out.println(bustinJiber.getName());
		bustinJiber.perform();
		
		System.out.println(celloist.getName());
		celloist.perform();
		celloist.playInstrument();
		
		System.out.println(guitarist.getInstrument());
		guitarist.practice();
		
		
		
	}
}
