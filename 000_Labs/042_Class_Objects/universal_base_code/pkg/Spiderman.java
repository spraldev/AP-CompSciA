/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	
	public int age;
	public String villain;
	public String actor;
	
	public Spiderman() {
		//do something lol
		
		villain = "King Pin";
		actor = "Miles Morales";
		age = 13;
	}
	
	public Spiderman(String actor) {
		//do something lol
		
		villain = "None";
		this.actor = actor;
		age = 0;
	}
	
	public Spiderman(String actor, int age) {
		//do something lol
		
		villain = "None";
		this.actor = actor;
		this.age = age;
	}
	
	public Spiderman(String actor, String villain) {
		//do something lol
		
		this.villain = villain;
		this.actor = actor;
		this.age = 0;
	}
	
	
	public void print() {
		System.out.println("--------------------------------");
		System.out.println("The actor " + this.actor + " is " + this.age + " years old.");
		System.out.println("They play Spiderman who's villain is " + this.villain);
		System.out.println("--------------------------------");
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setVillain(String villain) {
		this.villain = villian;
	}
}
