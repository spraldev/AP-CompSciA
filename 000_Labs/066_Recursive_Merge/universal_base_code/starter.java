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
		
		int [] arr = {8, 7, 1, 3, 6, 5, 4, 2};
		
		for (int i = 0; i < arr.length; i++) {
			// int num = (int) (Math.random() * 100) + 1;
			// arr[i] = num;
			
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		System.out.println();
		mergeSort(arr, 0, arr.length-1);

	}
	
	
	
	public static void merge(int a[], int midpoint, int first, int last) {
		
		if(last-first == 0) {
			return;
		}
		
		int newarr[] = new int[last-first+1];
		
		int i = 0, j = 0, k = 0;
		
		while (i < midpoint && j < last) {
			if(a[i] >= a[j]) {
				newarr[k++] = a[i++];
				System.out.println("hi");
			} else {
				System.out.println("hii");
				newarr[k++] = a[j + midpoint + 1];
				j++;
			}

		}
		
		System.out.println("------------------");
		
		
		System.out.println(i + " and " + j + " and " + k);
		System.out.println(first + " and " + midpoint + " and " + last);
		while (i < midpoint) {
			newarr[k] = a[i];
			i++;
			k++;
		}
		
		
		
		while (j+midpoint+1 < last) {
			newarr[k] = a[j+midpoint+1];
			j++;
			k++;
		}
	

		for(int z = 0; z < newarr.length; z++)
			System.out.print(newarr[z] + " ");
		

	}
	
	public static void mergeSort(int a[], int first, int last) {
		System.out.println(first + " + " + last);
		if(last - first == 0) {
			return;
		} else {
			int midpoint = (first + last)/2;

			int[] left = new int[midpoint - first + 1]; 
			int[] right = new int[last - midpoint];
			


			/*
			// populate left
			for (int i = 0; i < midpoint - first; i++) {
				left[i] = a[first + i];
			}
			
			//populate right
			for (int i = 0; i < last - midpoint + 1; i++) {
			    right[i] = a[i + midpoint + 1];
			}
			*/

			
			mergeSort(a, first, midpoint);
			mergeSort(a, midpoint + 1, last);
			
			merge(a, midpoint, first, last);

			System.out.println("\n\n");
			 
			
			// for (int i = 0; i < mergedLeft.length; i++) {
			// 	System.out.print(mergedLeft[i] + ", ");
			// }
			
			// for (int i = 0; i < mergedRight.length; i++) {
			// 	System.out.print(mergedRight[i] + ", ");
			// }
			
			
			
			

			
		}
	}
}
