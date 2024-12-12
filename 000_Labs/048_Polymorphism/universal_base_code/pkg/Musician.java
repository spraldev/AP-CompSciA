/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer {
    
    String instrument;

	public Musician() {
		this.instrument = "cello";
	}
	
	public Musician(String instrument) {
	    super();
		this.instrument = instrument;
	}
	
	
	public Musician(String instrument, String name, int age) {
	    super(name, age);
		this.instrument = instrument;
	}
	
	public String getInstrument() {
	    return this.instrument;
	}
	
	public void playInstrument() {
	    System.out.println(this.name + " is playing. their instrument " + instrument);
	}

}

