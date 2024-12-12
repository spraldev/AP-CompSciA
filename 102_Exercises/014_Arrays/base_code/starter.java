/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];

		for (int c = 0; c < arr1.length; c++) {
		 	arr1[c] = (c+1) * 3;
		 	System.out.println("Index c: " + c + "\n Value: " + arr1[c]);
		 }
		 
		 System.out.println("\n\n");
		 
		 int [] arr2 = new int[1001];
		 for(int z = 0; z < arr2.length; z++) {
		 	arr1[z] = arr2.length-1-z;
		 	System.out.println("Index c: " + z + "\n Value: " + arr1[z]);
		 }
		 
		 
	}
}
