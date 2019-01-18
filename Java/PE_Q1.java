/*
 * Project Eurler Q1
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class PE_Q1 {

	public static void main(String[] args) {
		// invoke method & print result to console
		System.out.println("Sum of multiples 3 & 5 below 1000: " + SumMultiples(3, 5, 1000));
	}
	
	public static int SumMultiples(int num1, int num2, int total) {
		int sum = 0;
		// iterate over numbers from num1 - total-1
		for (int i=num1; i<total; i++) {
			if (i % num1 == 0 || i % num2 == 0)
				sum+= i; // increment sum
		}
		return sum; 
		
	}

}
