/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        greetings("mr. Poole");
        
        double num = raise(10000.0, 15);
        
        System.out.println(num);
	}
	
	public static void printAnimal() {
	    System.out.println(" .--()°'.'");
        System.out.println("'|, . ,'");
        System.out.println("!_-(_\\\")");
	}
	
	public static void greetings(String name) {
	    System.out.println("Helloooooo " + name);
	}
	
	public static double raise(double salary, int percent) {
	    double newPercent = (0.01) * percent;
	    double percentSalary = newPercent * salary;
	    double raisedSalary = salary + percentSalary;
	    
	    return raisedSalary;
	}
}