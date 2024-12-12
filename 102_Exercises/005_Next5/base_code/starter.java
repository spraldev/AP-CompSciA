/*
 *	Author:Spursh
 *  Date:9/11
 *	Collaborator(s): me
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a num: ");
		int num = scanner.nextInt();
		
		System.out.print("\nHere are the next 5 numbers :D\n" + (num + 0) + ", " + (num + 1) + ", " + (num + 2) +  ", " + (num + 3) +  ", " + (num + 4) +   ", " + (num + 5));
		System.out.print("\nHere are the next 5 multiples :D\n" + (num * 1) + ", " + (num * 2) + ", " + (num * 3) +  ", " + (num * 4) +  ", " + (num * 5) +   ", " + (num * 6));
		
		System.out.print("\nHere is the number /10 :D\n" + ((double) num/10));
		System.out.print("\nHere is the number /100 :D\n" + ((double) num/100));
	}
}
