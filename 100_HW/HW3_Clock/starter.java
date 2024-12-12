/*
 *	Author: Spursh Deshpande
 *  Date: 9/19/24
 *	Collaborator(s): N/A
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input what day it is.\n[0] - Sunday\n[1] - Monday\n[2] - Tuesday\n[3] - Wednesday\n[4] - Thrusday\n[5] - Friday\n[6] - Saturday");
		
		int day = scanner.nextInt();
		
		switch (day) {
			case 0:
				System.out.println("Wake up at 10:00am");
			break;
			
			case 1:
				System.out.println("Wake up at 7:00am");
			break;
			
			case 2:
				System.out.println("Wake up at 7:00am");
			break;
			
			case 3:
				System.out.println("Wake up at 7:00am");
			break;
			
			case 4:
				System.out.println("Wake up at 7:00am");
			break;
			
			case 5:
				System.out.println("Wake up at 7:00am");
			break;
			
			case 6:
				System.out.println("Wake up at 10:00am");
			break;
			
			default:
				System.out.println("Invalid input");
			return;
			
			
		}
	}
}
