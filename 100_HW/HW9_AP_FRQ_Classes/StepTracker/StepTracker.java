import java.util.*;

public class StepTracker {
    int days;
    int activeDays;
    int steps;
    
    
    public StepTracker(int steps) {
        if(steps >= 10000) {
            this.steps += steps;
            this.activeDays++;
        }
        
        this.days++;
    }
    
    
    public int activeDays() {
        return this.activeDays;
    }
    
    public double avereageSteps() {
        return (1.0 * this.steps) / this.days;
    }
    
    public void addDailySteps(int steps) {
        this.steps += steps;
        
        if(steps >= 10000) {
            this.activeDays++;
        }
        
        this.days++;
    }
    
    public int activeDays() {
        return this.activeDays;
    }
    
    
}