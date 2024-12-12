/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee kevin = new Employee(2021, "Kevin", "Malone", 4416.66);
		
		dwight.raiseSalary(100);
		dwight.employeeToString();
		
		jim.raiseSalary(100);
		jim.employeeToString();
		
		pam.raiseSalary(100);
		pam.employeeToString();
		
		kevin.raiseSalary(100);
		kevin.employeeToString();
		
		michael.raiseSalary(100);
		michael.employeeToString();
		
	}
}
