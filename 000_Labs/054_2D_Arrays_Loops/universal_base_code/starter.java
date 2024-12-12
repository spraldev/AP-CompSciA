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
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many rows do you want?");
		
		int height = scanner.nextInt();
		
		System.out.println("How many columns do you want?");
		
		int width = scanner.nextInt();
		
		
		int [][] arr = new int[height][width];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int) (Math.random() * 9) + 1;
			}
			

		}
		
		rowAvg(arr, height, width);
		System.out.println("---------");
		allAvg(arr, height, width);
		System.out.println("---------");
		allVals(arr, height, width);
	}
	
	public static void rowAvg(int[][] arr, int height, int width) {
		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			int rowCount = 0;
			
			for (int j = 0; j < arr[0].length; j++) {
				rowSum += arr[i][j];
				rowCount++;
			}
			
			System.out.println("Row #" + (i+1)  + " - " + ((double) rowSum/rowCount));
		}
	}
	
	public static void allAvg(int[][] arr, int height, int width) {
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		
		System.out.println("Avg of 2d array" + " - " + ((double) sum/count));
	}
	
	public static void allVals(int[][] arr, int height, int width) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.print("\n");
		}
		
	}
}
