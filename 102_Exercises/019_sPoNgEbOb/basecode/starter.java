/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input your sentence: ");
		
		String sentence = scanner.nextLine();
		
		boolean Fliped = true;
		
		String newSente = "";
		
		for(int i = 0; i < sentence.length(); i++) {
			String sub = sentence.substring(i, i+1);
			
			if(sub.equals(" ")) {
				Fliped = true;
				newSente += " ";
				continue;
			}
			
			if (Fliped) {
				newSente += sub.toLowerCase();
			} else {
				newSente += sub.toUpperCase();
			}
			
			Fliped = !Fliped;
		}
		
		System.out.println("\n Your new string: " + newSente);
	}
}
