package practiceproblems;

public class FizzBuzz {

	public static void main(String[] args) {
		// FizzBuzz is a divisible game by 3's ands 5's. 
		int n = 100;
		 
        // loop for 100 times
        for (int i=1; i<=n; i++)                                
        {
            //number divisible by 15(divisible by
            // both 3 & 5), print 'FizzBuzz' in
            if (i%15==0) {
            	System.out.print("FizzBuzz"+" ");
            }
                
            // number divisible by 5, print 'Buzz'
            else if (i%5==0) {
            	System.out.print("Buzz"+" ");
            }
 
            // number divisible by 3, print 'Fizz'
            else if (i%3==0) {
            	System.out.print("Fizz"+" ");
            }
                 
            else // print the numbers
                System.out.print(i+" ");                        
        }
	}

}
