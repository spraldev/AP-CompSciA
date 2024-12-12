/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class ApSciCourse extends ScienceCourse  {
	public ApSciCourse(String field, int grade, String teacher) {
	    super(field, grade, teacher);
	}
	
	public void calcCredit() {
	    if(grade >= 90) {
	        credit = 5;
	    } else if (grade >= 80) {
	        credit = 4;
	    } else if (grade >= 70) {
	        credit = 3;
	    } else if (grade >= 60) {
	        credit = 2;
	    } else if (grade < 60) {
	        credit = 1;
	    } else {
	        credit = 0;
	    }
	}

}

