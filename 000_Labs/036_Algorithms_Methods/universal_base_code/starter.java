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
		
		int arr[] = new int[100];
		
		for (int i = 0; i < 100; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		
		
		toStringArray(arr);
		System.out.println("----------");
		
		System.out.println(getArrayAverage(arr));
		System.out.println(getArrayMax(arr));
		System.out.println(getArrayMin(arr));
		
		
		


		
	}
	
	public static void toStringArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int getArrayAverage(int arr[]) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum/arr.length;
	}
	
	public static int getArrayMax(int arr[]) {
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} 
		}
		
		return max;
	}
	
	public static int getArrayMin(int arr[]) {
		int min = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min || min ==0) {
				min = arr[i];
			} 
		}
		
		return min;
	}
	
	
	
}
