/*
 * Project Euler Q2
 * 
 * Find the sum of all even Fibonacci numbers less than four million
 */

#include <iostream>
using namespace std;

int main() {
	int num1 = 1; int num2 = 2;
	int fib = 0;
	int sum = 2;
	while (fib < 4000000) {
		fib = num1 + num2;
		num1 = num2;
		num2 = fib;
		if (fib % 2 == 0) {
			sum += fib;
		}
	}
	cout << "Sum of even fibonacci numbers less than 4 mio: " << sum << endl;
       	return 0;
}

