package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie() {
        this.movieName = "Avengers";
        this.rating = 8.0;
        this.numRatings = 33;
        this.revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue) {
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString() {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        
        System.out.println("\n");
    }
    
    public String getMovieName() {
        return this.movieName;
    }
    
    public int getRevenue() {
        return this.revenue;
    }
    
    public void addRating(double newRating) {
        double unavged = this.rating * (1.0 * numRatings);
        numRatings++;
        this.rating = (unavged + newRating)/this.numRatings;
    }
    
    public double getRating() {
        return this.rating;
    }
    
    public boolean compareRatings(Movie m) {
        if(m.getRating() > this.rating) {
            return false;
        } else {
            return true;
        }
    }
     
    public String revenueToString() {
        int rev = this.revenue;
        int i = 0;
        String str = "";
        
        while (rev != 0) {
            i++;
            int digit = rev % 1000;
            if(i == 1){
                str = + digit + str;
            }
            else{
                str = + digit + "," + str;
            }
            rev = rev / 1000;
        }
        
        return str;
        
    } 
    
    public Movie pirateMovie() {
        return new Movie(this.movieName, this.rating, this.numRatings, this.revenue);
    }
}
