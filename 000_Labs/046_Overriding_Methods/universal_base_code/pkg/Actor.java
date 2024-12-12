/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	String type;

	public Actor() {
		this.type = "Theater"
	}
	
	public Actor(String name, String Type) {
	    super(name);
		this.type = type
	}

    public void practice() {
		System.out.println(getName() + " is practicing acting");
	}
	
	public void perform() {
		System.out.println(getName() + " is performing acting");
	}
	
	public void monologue() {
	    System.out.println("Insert Monolouge here")
	}

}

