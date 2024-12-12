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
    
    public String setRole(String role) {
    	switch(role.toLowerCase()) {
		  case "w":
		  	role = "Wizard";
		    break;
		  case "wa":
		    role = "Warrior";
		    break;
		  case "r":
		    role = "Rogue";
		    break;
		    
		  default:
			return ""
		}
    }
    
    public int setStrength(int Strength) {
    	if(Strength < 0) {
			return 0;
		} else {
			return Strength;
		}
    }
    
    public int setDexterity(int Dexterity) {
    	if(Dexterity < 0) {
			return 0;
		} else {
			return Dexterity;
		}
    }
    
    public int setCharisma(int Charisma) {
    	if(Charisma < 0) {
			return 0;
		} else {
			return Charisma;
		}
    }
    
    public int setIntelligence(int Intelligence) {
    	if(Intelligence < 0) {
			return 0;
		} else {
			return Intelligence;
		}
    }
    
    public boolean setAll(String role, int Strength, int Dexterity, int Charisma, int Intelligence) {
    	switch(role.toLowerCase()) {
		  case "w":
		  	return true;
		    break;
		  case "wa":
		    return true;
		    break;
		  case "r":
		    return true;
		    break;
		    
		  default:
			return false;
		}
		
		if(Strength < 0) {
			return false;
		} else {
			return true;
		}
		
    	if(Dexterity < 0) {
			return false
		} else {
			return true
		}
		
		if(Charisma < 0) {
			return false;
		} else {
			return true;
		}
		
		if(Intelligence < 0) {
			return false;
		} else {
			return true;
		}
		
		
		
    }
    
    
}
