/*
 * Project Euler Q2
 * 
 * Find the sum of all even Fibonacci numbers less than four million
 */

public class PE_Q2 {

	public static void main(String[] args) {
		// invoke method & print result to console
		System.out.println("Sum of even fibonacci numbers less than 4 mio: " + SumEvenFib(4000000));
	}
	public static int SumEvenFib(int total) {
		// initialise variables
		int num1 = 1;
		int num2 = 2;
		int fib = 0;
		int sum = 2; // 
		while ( fib < total ) {
			fib = num1 + num2;
			num1 = num2; 
			num2 = fib; 
			
			if (fib % 2 == 0) {
				sum += fib;
			}
		}
		return sum;
	}

}


