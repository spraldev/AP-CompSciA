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
		
		
		Musician bustinJiber = new Musician("Bustin Jiber", "Guitar");
		Musician taylor = new Musician("Taylor Swift", 34, "Piano");
		
		
		System.out.println(bustinJiber.getName());
		bustinJiber.practice();
		System.out.println(bustinJiber.getInstrument());
		
		System.out.println(taylor.getName());
		bustinJiber.perform();
		taylor.playInstrument();
		
		
		
		
		
		
	}
}
