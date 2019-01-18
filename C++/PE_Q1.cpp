/*
 * Project Eurler Q1
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

#include <iostream>
using namespace std;


int main() {
	int sum; // sum of multiples
	for (int i = 3; i < 1000; i++) {
	      if ((i % 3 == 0) || (i % 5 == 0))
		      sum += i; // increment sum
	}
	// print result to console
	cout << "Sum of multiples of 3 or 5 below 1000 equals: " << sum << endl;
	return 0;
	      		      
}
