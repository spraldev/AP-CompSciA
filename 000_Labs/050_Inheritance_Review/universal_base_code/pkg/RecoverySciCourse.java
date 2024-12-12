/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class ApSciCourse extends ScienceCourse  {
    boolean passed;
    
	public ApSciCourse(String field, int grade, String teacher) {
	    super(field, grade, teacher);
	}
	
	public void calcCredit() {
        if (grade > 60) {
	        this.passed = true;
	    } else {
	        this.passed = false;
	    }
	}
	
	
	public boolean isPassed() {
	    return this.passed
	}

}

