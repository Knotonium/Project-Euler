// Problem 1:
// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

public class Multiples_of_3_and_5 {
	public static void main (String[] args) {
		int MAX = 1000, multi_3 = 3, multi_5 = 5, sum = 0;
		
		for ( int i = 0; i < MAX; i++) {
			if ((i % multi_3 == 0) | (i % multi_5 == 0)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
