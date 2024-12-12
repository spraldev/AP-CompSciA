/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		
		int [] arr = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			arr[i] = (int) (Math.random() * 1000);
		}
		
		int num = 0;
		
		while (num < 1000) {
			System.out.println(arr[num]);
			num++;
		}


		
	}
}
