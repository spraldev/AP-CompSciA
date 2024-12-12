/*
 *	Author:  
 *  Date: 
*/

package pkg;

import java.util.Scanner;
import java.util.Random;

public class myCharacter {
    
    String role = "";
    int Strength = 0;
    int Dexterity = 0;
    int Charisma = 0;
    int Intelligence = 0;
    
    public myCharacter(String role, int Strength, int Dexterity, int Charisma, int Intelligence) {
        Strength = Strength;
        Dexterity = Dexterity;
        Charisma = Charisma;
        Intelligence =  Intelligence;
        role = role;
        
        System.out.println("You are a: " + role);
        System.out.println("Your Dexterity: " + Dexterity);
        System.out.println("Your Charisma: " + Charisma);
        System.out.println("Your Intelligence: " + Intelligence);
        
    }
    
    public myCharacter() {
    	role = "no role";
    	System.out.println("You are a: " + role);
    }
    
    public myCharacter(String role) {
    	role = role;
    	System.out.println("You chose " + role + "! How cunning!");
    }
    
    
}
