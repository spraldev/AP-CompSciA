package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void findNSpecialSquares(int n) {
		int j = 1;
		
		int counter = 0;
		
		System.out.println("hid");
		while (counter < n) {
			// compute a perfect square
			int perfSquare = j*j;
			int num = 0;

			// check if that square is the sum of all integers 1...x
			
			
			int sum = 0; 
			
			for (int k = 1; sum < perfSquare; k++) {
				sum+=k;
				
				if (sum == perfSquare) {
	                System.out.println(perfSquare);
	                counter++;
	                break;
            	}
			}
			
			j++;
			
			
		}
	}
	

	
}
