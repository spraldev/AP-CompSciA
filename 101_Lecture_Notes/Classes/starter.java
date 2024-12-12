/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        Car mobile = new Car();
        Car batMobile = new Car("lambo", 525, false, "Black");
        
        mobile.vroom();
        batMobile.vroom();
	}
}