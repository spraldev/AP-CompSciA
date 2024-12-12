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
		int [] arr = new int[200];
		
		for (int i = 0; i < 200; i++) {
			int num = (int) (Math.random() * 100) + 1;
			arr[i] = num;
		}
		
		for (int i = 0; i < 199; i++) {
			int min_index= i;
			 
			 for (int j = i+1; j < arr.length; j++ ) {
			 	 //min_index = i;
			 	if(arr[j] < arr[min_index]) {
			 		min_index = j;
			 	}
			 }
			 
			 int temp = arr[i];
			 arr[i] = arr[min_index];
			 arr[min_index] = temp;
		}


		for (int i = 0; i < 200; i++) {
			System.out.print(arr[i] + ", ");
		}


	}
}
