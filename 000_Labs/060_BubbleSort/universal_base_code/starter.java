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
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < 200; i++) {
			System.out.print(arr[i] + ", ");
		}



	}
}
