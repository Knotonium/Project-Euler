// Problem 3:
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

public class Largest_Prime_Factor {
	public static void main(String[] args) {
		long a = 600851475143L;
		long primeFactor = 0;
		
		for (int i = 2; i <= (a / i); i++) {
			while (a % i == 0) {
				primeFactor = i;
				a /= i;
			}
		}
		if (a > 1) {
			primeFactor = a;
		}
		System.out.println(primeFactor);
	}	
}
