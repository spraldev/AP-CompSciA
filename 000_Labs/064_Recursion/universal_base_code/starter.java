/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		System.out.println(fact(3));
		
		System.out.println(recurPower(3, 4));



	}
	
	public static int fact(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
	
	public static int recurPower(int base, int n) { 
		if(n == 1) {
			return base;
		} else {
			return base * (int) recurPower(base, n-1);
		}
	}
}
