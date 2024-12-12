/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class extra {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your first double (x):");
		double Dub1x = scanner.nextDouble();
		
		System.out.println("Input your second double (y):");
		double Dub2y = scanner.nextDouble();
		
		System.out.println("Max: " + Math.max(Dub1x, Dub2y));
		System.out.println("Sqrt: " + Math.sqrt(Dub2y));
		System.out.println("Sqrt: " + Math.pow(Dub1x, Dub2y));
	}
}
