/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MathCourse extends Course{
	String difficulty;

	public MathCourse() {
	    super();
	    this.difficulty = "Hard";
	}
	
	public MathCourse(String difficulty) {
	    super();
	    this.difficulty = difficulty;
	}
	
	public MathCourse(String difficulty, int grade, String teacher) {
	    super(grade, teacher);
	    this.difficulty = difficulty;
	}
	
    public String getDifficulty() {
        return this.difficulty;
    }
    
    public String setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    
    
    public String toString() {
	    return ("Teacher: " + teacher) + ("Credit: " + credit) + ("Difficulty: " + difficulty);
	}

}

