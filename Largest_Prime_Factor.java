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
