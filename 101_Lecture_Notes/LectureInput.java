/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;


class LectureInput{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! :D");
        
        System.out.println("Please enter a numver");
        int bob = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter another number");
        int somethingElse = scanner.nextInt();
         scanner.nextLine();
        
        System.out.println("The sum of both numbers are: " + (bob + somethingElse));
        
        System.out.println("What's your favorite food?");
        String food = scanner.nextLine();
        
        System.out.println("Your favorite food is: " + food);
	}
}