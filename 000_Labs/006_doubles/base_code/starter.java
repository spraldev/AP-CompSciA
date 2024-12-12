/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Temp = new Scanner(System.in);
	    System.out.println("Enter the Fahrenheit temp");
	
	    double temp = Temp.nextDouble();
	    
	    double CelTemp = (temp - 32) * 5/9;
	    
	    System.out.println(CelTemp + "°" + " Celsius");
	}
}
