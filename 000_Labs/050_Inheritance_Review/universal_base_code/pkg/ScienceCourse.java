/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class ScienceCourse extends Course{
	String field;

	public ScienceCourse() {
	    super();
	    this.field = "Chem";
	}
	
	public ScienceCourse(String field) {
	    super();
	    this.field = field;
	}
	
	public ScienceCourse(String field, int grade, String teacher) {
	    super(grade, teacher);
	    this.field = field;
	}
	
    public String getField() {
        return this.field;
    }
    
    public String setField(String field) {
        this.field = field;
    }
    
    
    public String toString() {
	    return ("Teacher: " + teacher) + ("Credit: " + credit) + ("Field: " + field);
	}

}

