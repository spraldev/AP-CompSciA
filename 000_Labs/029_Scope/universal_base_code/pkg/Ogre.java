/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	public String name;
	boolean ugly = true;

	public Ogre() {
		name = "Shrek";

	}

	public String getName(){
		return name;
	}

	public boolean isUgly(){
		return ugly;
	}

	public void interact(Donkey donkey){
		System.out.println(donkey.name + ", what are you doing in my swamp?!");
		return;
	}


}
