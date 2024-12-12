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
		
		System.out.println(fibo(5));




	}
	
	public static int fibo(int n) {
		if(n == 1 || n == 2) {
			return 1;
		} else if (n == 3) {
			return 2;
		} else {
		
		return fibo(n - 2) + fibo(n -1);
		
		}
	}
}
