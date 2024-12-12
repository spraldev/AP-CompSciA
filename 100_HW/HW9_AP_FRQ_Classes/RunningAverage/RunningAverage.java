import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
        average = 0.0;
        count = 0;
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        double unavged = this.average * (1.0 * count);
        this.count++;
        this.average = (unavged + newVal)/this.count;
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        int valid = 0;
        
        for (int i = 0; i < num; i++) {
            if(getNewRating() >= 0) {
                valid++;
            }
        }
        
        return valid;
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        /* implementation not shown */
    }
}
