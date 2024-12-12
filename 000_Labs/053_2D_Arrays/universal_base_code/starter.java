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
		
		int [][] twod = new int[2][2];
		
		twod[0][0] = 1;
		twod[0][1] = 2;
		twod[1][0] = 3;
		twod[1][1] = 4;
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < twod.length; i++) {
			for (int j = 0; j < twod[0].length; j++) {
				sum += twod[i][j];
				count++;
			}
		}
		
		System.out.println(sum/count);
		
		

		
	}
}
