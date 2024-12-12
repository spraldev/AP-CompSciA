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
		
		int len = (int) (Math.random() * 149) + 51;
		
		int [] arr = new int[len];
		
		System.out.println("Adding values to the array :D");
		
		for (int i = 0; i < len; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		
		System.out.println(arr);
		
		int max = 0;
		
		for (int i = 0; i < len; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Max: " + max);
		
		int min = 0;
		
		for (int i = 0; i < len; i++) {
			if(arr[i] < min || min == ) {
				min = arr[i];
			}
		}
		
		System.out.println("Min: " + min);
		
		
		int sum = 0;
		
		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}
		
		int avg = sum/len;
		
		System.out.println("Avg: " + avg);
		
		
		System.out.println("Length: " + len);
		

	}
}
