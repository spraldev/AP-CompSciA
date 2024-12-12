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
		
		System.out.println("How many cookies do you want?");
		
		int count = scanner.nextInt();
		scanner.nextLine();
		
		ArrayList <String> arr = new ArrayList<String>(count);
		
		
		
		
		System.out.println("Now, let me know what should be stored in your cookies.");
		for (int i = 0; i < count; i++) {
			System.out.print("Cookie #" + (i + 1) + ": ");
			String Cookie = scanner.nextLine();
			
			arr.add(Cookie);
		}
		
		System.out.println("----------Here are your cookies---------");
		
		for (int i = 0; i < count; i++) {
			System.out.println("Cookie #" + (i+1) + " " +  arr.get(i));
		}



	}
}
