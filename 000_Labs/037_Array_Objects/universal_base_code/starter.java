/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Wizard wizards[] = new Wizard[100];
		Warrior warriors[] = new Warrior[100];
		
		for (int i = 0; i < 100; i++) {
			wizards[i] = new Wizard();
			warriors[i] = new Warrior();
		}
		
		int wizardScore = 0;
		int warriorScore = 0;
		int wizardRemainingPlayers = 0;
		int warriorRemainingPlayers = 0;
		
		boolean warriorAttack = false;
		int i = 0;
		int j = 0;
			
			while(!wizards[99].isDead() && !warriors[99].isDead()) {
				if(warriorAttack) {
					warriors[i].attack(wizards[i]);
					warriorAttack = false;
				} else {
					wizards[i].attack(warriors[i]);
					warriorAttack = true;
				}
				
				if(wizards[i].isDead()) {
					i++;
					warriorScore++;
					warriorRemainingPlayers++;
				} else if(warriors[i].isDead()) {
					j++;
					wizardScore++;
					wizardRemainingPlayers++;
				}
				
				
			}
		
		if(wizardScore > warriorScore) {
			System.out.println("Wizards won with " + (100 - j) + " remaining players!");
		} else {
			System.out.println("Warriors won with " + (100 - i) + " remaining players!");
		}
		
		

	}
}
