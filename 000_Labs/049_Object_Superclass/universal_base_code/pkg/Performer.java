/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	String name;
	int age;

	public Performer() {
	    this.name = "Doja Cat";
	    this.age = 26;
	}
	
	public Performer(String name, int age) {
	    this.name = name;
	    this.age = age;
	}
	
	public Performer(String name) {
	    this.name = name;
	    this.age = 26;
	}
	
	public String getName() {
	    return this.name;
	}
	
	public void practice() {
		System.out.println(name + " is practicing");
	}
	
	public void perform() {
		System.out.println(name + " is performing");
	}
	
	public String toString() {
		return ("Name : " + name ) + ("Age : " + age);
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Performer)) {
			return false;
		} else {
			return this.name.equals(((Performer)other).name);
		}
		
		
	}

}

