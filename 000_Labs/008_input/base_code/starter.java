/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your first name");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        
        System.out.println("Enter your Birthday Month");
        int bDayMonth = scanner.nextInt();
        
        System.out.println("Enter your Birthday Day");
        int bDayDay = scanner.nextInt();
        
        System.out.println("Enter your Birthday Year");
        int bDayYear = scanner.nextInt();
        
        System.out.println("Enter how much a buck fifty is");
        int buckFifty = scanner.nextInt();
        
        System.out.println("Your name is " + name + " and you were born on " + bDayMonth + "/" + bDayDay + "/" + bDayYear + ".");
        System.out.println("You are " + age + " years old :D");
        System.out.println("You have $" + buckFifty + " in your wallet.");
        
        scanner.close();
		
		
		
	}
}
