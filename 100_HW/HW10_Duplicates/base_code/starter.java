/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 9) + 1;
		}
		
		int target = (int) (Math.random() * 9) + 1;
		
		System.out.println("traget: " + target);
		System.out.println("\n\n");
		
		int dupeCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				System.out.println("Duplicate found!");
				System.out.println("Index : " + i);
				System.out.println("\n");
				dupeCount++;
			}
			
			if(i == 0) {
				continue;
			} else if (arr[i] == arr[i-1]) {
				System.out.println("Consecutive found!");
				System.out.println("Index1 : " + i);
				System.out.println("Index2 : " + (i-1));
				System.out.println("Number : " + arr[i]);
				System.out.println("\n");
			}
		}
		
		System.out.println("There were " + dupeCount + " duplicates\n");
		System.out.println("Printing Array:");
		System.out.print("[");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("]");
		
	
		
		
	}
}
