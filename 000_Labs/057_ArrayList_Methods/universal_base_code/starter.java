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
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How big should the array list be??");
		
		int count = scanner.nextInt();
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>(count);
		
		for (int i = 0; i < count; i++) {
			arr.add((int) (Math.random() * 100) + 1);
		}
		
		while(true) {
			toStringArrayList(arr);
			getArrayListAverage(arr);
			getArrayListMax(arr);
			getArrayListMin(arr);
			
			
			System.out.println("How big should the array list be??");
		
			count = scanner.nextInt();
			
			arr = new ArrayList<Integer>(count);
		
			for (int i = 0; i < count; i++) {
				arr.add((int) (Math.random() * 100) + 1);
			}
			
		}
		



	}
	
	public static void toStringArrayList(ArrayList<Integer> arr) {
		int size = arr.size();
		
		System.out.println("\n-------Printing Array List-------\n");
		
		for (int i = 0; i < size; i++) {
			System.out.println(arr.get(i));
		}
	}
	
	public static void getArrayListAverage(ArrayList<Integer> arr) {
		int size = arr.size();
		int count = 0;
		int sum = 0;
		
		System.out.println("\n-------Printing Array List Avereage-------\n");
		for (int i = 0; i < size; i++) {
			sum += arr.get(i);
			count++;
		}
		
		System.out.println((double) sum/count);
	}
	
	public static void getArrayListMax(ArrayList<Integer> arr) {
		int size = arr.size();
		int max = 0;
		
		System.out.println("\n-------Printing Array List Max-------\n");
		
		for (int i = 0; i < size; i++) {
			if(arr.get(i) > max) {
				max = arr.get(i);
			}
		}
		
		System.out.println(max);
	}
	
	public static void getArrayListMin(ArrayList<Integer> arr) {
		int size = arr.size();
		int min = 0;
		
		System.out.println("\n-------Printing Array List Max-------\n");
		
		for (int i = 0; i < size; i++) {
			if(arr.get(i) < min || min == 0) {
				min = arr.get(i);
			}
		}
		
		System.out.println(min);
	}
	
	
}
