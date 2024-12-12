/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first int: ");
		int Int1 = scanner.nextInt();
		
		
		System.out.println("Enter your second int (Larger than the first): ");
		int Int2 = scanner.nextInt();
		
		if(Int2 <= Int1) {
			System.out.println("The second int must be greater than the first.");
			return;
			
		}
		
		int range = Int2 - Int1;
		
		System.out.println("\n----------------------");
		
		
		
		System.out.println("Your range is " + Int1 + " to " + Int2 + ".");
		System.out.println("Here are 5 numbers generated in that range");
		String nums = "";
		
		
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * range) + Int1;
			nums += num;
			
			if(i !=4 ) {
				nums += ", ";	
			}
		}
		
		System.out.println(nums);
		
		
		
	}
}
