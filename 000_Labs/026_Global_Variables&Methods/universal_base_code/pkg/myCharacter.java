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
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Charisma = Charisma;
        this.Intelligence = Intelligence;
        this.role = role;
    }
    
    public void tostring() {
    	System.out.println("You are a: " + this.role);
        System.out.println("Your Dexterity: " + this.Dexterity);
        System.out.println("Your Charisma: " + this.Charisma);
        System.out.println("Your Intelligence: " + this.Intelligence);
    }
    
    
}
