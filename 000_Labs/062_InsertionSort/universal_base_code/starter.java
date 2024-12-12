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
		
		for (int i = 0; i < 200; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
		
		for (int i = 0; i < 200; i++) {
			System.out.print(arr[i] + ", ");
		}



	}
}
