/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scanner = new Scanner(System.in);
		
		int money = 100;
		
		System.out.println("Slot Machine Rules: ");
        System.out.println("1. Each player starts with $100.");
        System.out.println("2. Input a wager less than your total amount of money.");
        System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
        System.out.println("   a. If two numbers match, you double your money.");
        System.out.println("   b. If three numbers match, you triple your money.");
        System.out.println("   c. If none match, you lose your money.");
        
        
        while(true) {
        	System.out.println("\n---------------------------------------\n");
        	System.out.print("Would you like to play the slots? [y]-yes | [n]-no : ");
        	
        	String play = scanner.nextLine();
        	
        	if(!play.equals("y")) {
        		break;
        	}
        

        	
        	System.out.println("You have " + money + ". How much would you like to wager? ");
        	
        	int wager = scanner.nextInt();
        	
        	if(wager > money || wager < 1) {
        		System.out.print("Cannot be less than 0, or greater than the amount of money you have");
        		break;
        	} 
        	
        	
        	
        	int num1 = (int) (Math.random() * 10) + 1;
        	int num2 = (int) (Math.random() * 10) + 1;
        	int num3 = (int) (Math.random() * 10) + 1;
        	
        	System.out.println("Great! Lets play :D");
        	System.out.println("Your rolls are: \n");
        	System.out.println("_______________________");
        	System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " | ");
        	
        	if(num1 == num3 && num3 == num2) {
        		System.out.println("Congrats!! They are all equal, and that means you tripled your money :DDD");
        		money = money + (wager * 3);
        	} else if (num1 == num2 || num2 == num3 || num1 == num3) {
        		System.out.println("Congrats! two are equal, and that means you doubled your money :DDD");
        		money = money + (wager * 2);
        	} else {
        		System.out.println("Sadly, none are equal. Thus you lost $" + wager);
        		money = money - wager;
        	}
        	
        	System.out.println("You have $" + money + " remaining!");
        	
        	if(money == 0) {
                System.out.println("You have no money left! please try again later.");
                break;
            }
        	
        	scanner.nextLine();
        	
        	
        	
        }
        
	}
}
