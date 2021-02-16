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
