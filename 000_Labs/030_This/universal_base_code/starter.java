/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	
	public static int randAge(){
		int rand = (int)(Math.random()*7);
		return rand;
	}

	public static void main(String args[]) {
		PooleDwarf dwarf1 = new PooleDwarf(randName(), randAge());
		PooleDwarf dwarf2 = new PooleDwarf(randName(), randAge());
		PooleDwarf dwarf3 = new PooleDwarf(randName(), randAge());
		PooleDwarf dwarf4 = new PooleDwarf(randName(), randAge());
		PooleDwarf dwarf5 = new PooleDwarf(randName(), randAge());
		PooleDwarf dwarf6 = new PooleDwarf(randName(), randAge());
		PooleDwarf dwarf7 = new PooleDwarf(randName(), randAge());
		PooleDwarf dwarf8 = new PooleDwarf(randName(), randAge());
		
		int matches = 0;
		String name = "";
		
		if(dwarf1.isSameName(dwarf2.name)) {
			matches++;
			name = dwarf2.name;
		}
		
		if(dwarf1.isSameName(dwarf3.name)) {
			matches++;
			name = dwarf3.name;
		}
		
		if(dwarf1.isSameName(dwarf4.name)) {
			matches++;
			name = dwarf4.name;
		}
		
		
		if(dwarf1.isSameName(dwarf5.name)) {
			matches++;
			name = dwarf5.name;
		}
		
		if(dwarf1.isSameName(dwarf6.name)) {
			matches++;
			name = dwarf6.name;
		}
		
		if(dwarf1.isSameName(dwarf7.name)) {
			matches++;
			name = dwarf7.name;
		}
		
		System.out.println("The dupilcate name was: " + name);
		System.out.println("There were " + matches + " Matches! :D");
	}
}
