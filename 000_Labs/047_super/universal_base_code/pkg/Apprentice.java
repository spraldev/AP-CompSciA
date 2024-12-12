/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	String school;
	int yearsOfExperience;

	public Apprentice() {
	    super();
		this.school = "CVHS";
		this.yearsOfExperience = 0;
	}
	
	public Apprentice(String School, int yearsOfExperience) {
	    super();
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public Apprentice(String instrument, String School, int yearsOfExperience) {
	    super(instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public Apprentice(String name, int age, String instrument, String School, int yearsOfExperience) {
	    super(instrument, name, age);
		this.school = School;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void playInstrument() {
	    System.out.println(getName() + " is playing. their instrument and theyre bad beacues they are an apperentcie ;-;" );
	}
	
	public void practice() {
		System.out.println(getName() + " is practicing and they have " + yearsOfExperience + "years of experience.");
	}
	
	public void perform() {
		System.out.println(getName() + " is performing but they are bad bc they are an apperentice lol");
	}
	
	public void practiceAtUniversity() {
		System.out.println(getName() + " is practicing at " + this.school);
	}

}

