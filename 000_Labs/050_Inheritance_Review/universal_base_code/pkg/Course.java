/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
	int grade;
	int credit;
	String Teacher;

	public Course() {
		this.grade = 0;
		this.teacher = "Poole";
	}
	
	public Course(int grade, String teacher) {
		this.grade = grade;
		this.teacher = teacher;
	}
	
	public void calcCredit() {
	    if(grade >= 90) {
	        credit = 4;
	    } else if (grade >= 80) {
	        credit = 3;
	    } else if (grade >= 70) {
	        credit = 2;
	    } else if (grade >= 60) {
	        credit = 1;
	    } else if (grade < 60) {
	        credit = 0;
	    } else {
	        credit = 0;
	    }
	}
	
	public String toString() {
	    return ("Teacher: " + teacher) + ("Credit: " + credit);
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Course)) {
			return false;
		} else {
			return this.teacher.equals(((Course)other).teacher);
		}
		
		
	}
	
	

}

