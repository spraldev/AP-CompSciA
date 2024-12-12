/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    String make;
    double maxSpeed;
    boolean isElectric;
    String color;
    
    public Car(String m, double s, boolean i, String c) {
        make = m;
        maxSpeed = s;
        isElectric = i;
        color = c;
        
    }
    
    public Car() {
        make = "Bus";
        maxSpeed = 1.1;
        isElectric = false;
        color = "Red & Black";
    }
    
    public void paint(String c) {
        this.color = c;
    }
    
    public void vroom() {
        for (int i = 0; i< maxSpeed; i++) {
            System.out.println(make + "Goes VROOOOOM");
        }
    }
}