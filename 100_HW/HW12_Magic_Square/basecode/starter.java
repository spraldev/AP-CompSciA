import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		System.out.println(CVMath.findMid(2,3,1));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many nums would you like to see? ");
		int num = scanner.nextInt();
		
		CVMath.findNSpecialSquares(num);
	}
	
	
}
