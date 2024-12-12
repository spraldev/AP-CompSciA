/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class HistoryCourse extends Course{
	int era;

	public HistoryCourse() {
	    super();
	    this.era = 1000;
	}
	
	public HistoryCourse(int era) {
	    super();
	    this.era = era;
	}
	
	public HistoryCourse(int era, int grade, String teacher) {
	    super(grade, teacher);
	    this.era = era;
	}
	
    public String getEra() {
        return this.era;
    }
    
    public String setEra(int era) {
        this.era = era;
    }
    
    
    public String toString() {
	    return ("Teacher: " + teacher) + ("Credit: " + credit) + ("Difficulty: " + difficulty);
	}

}

