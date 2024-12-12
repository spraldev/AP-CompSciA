/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Create a program that finds ALL prime numbers under an input value and prints them out. This uses two methods. Example Program in Folder 100, HW6

		// How to find if a number is prime: Divide all numbers less than that number by the number, check if ANY are divisible. If any are, it isn't prime.
		
		// Example: The number is 13.
		// 13%12 != 0
		// 13%11 != 0
		// 13%10 != 0
		// ....
		// 13%3 != 0
		// 13%2 != 0
		// None of them are equal to 0, the number is prime.
		// First Method
		
		// 1. Named checkPrime
		// 2. Takes in 1 integer parameter
		// 3. Uses a while loop to check if the input number is prime.
		// 4. Returns a boolean
		//       a. True if prime
		//       b. False if not prime
		
		// Second Method
		// 1. Named printPrimes
		// 2. Takes in 1 integer parameter 
		//      a. This integer is given by an input using Scanner in your main
		//      b. This integer is the highest number checked to be prime
		// 3. The method uses a while loop to print EVERY prime number that's less than the input integer
		//      a. This method should CALL the checkPrime method on EVERY number that's less than the input integer
		//      b. Given checkPrime being a boolean, print the checked value if it is returned true.
		// 4. Returns nothing
		
		// Main
		// 1. Create a Scanner
		// 2. Prompt the user to input an integer
		// 3. Take in an input integer
		// 4. Call the printPrimes method. 
		
		// Hint: Start all counters for loops at 2. Ignore 1 (which isn't a prime number).
		
		// If you have questions, feel free to message on Discord or ask classmates. The example is in folder 100 in HW6
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Choose a number");
		int num = scanner.nextInt();
		
		printPrimes(num);
	}
	
	public static boolean checkPrime(int num) {
		for (int i = 2; i < num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	public static void printPrimes(int num) {
		int count = 2;
		
		while (count < num) {
			if(checkPrime(count)) {
				System.out.println(count);
			}
			
			
			count++;
		}
	}
}
