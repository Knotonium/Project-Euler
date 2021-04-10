// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.


public class Largest_Product_Palindrome {
    public static void main(String[] args) {

        final int MAX = 999;
        int product = 0;

        for (int x = MAX; x > 900; x--) {
            for (int y = MAX; y > 900; y--) {
                product = y * x;
                String s = String.valueOf(product);

                if (s.charAt(0) == s.charAt(s.length() - 1) & s.charAt(1) == s.charAt(s.length() - 2) & s.charAt(2) == s.charAt(s.length() - 3)) {
                    System.out.println(product);
                }
            }
        }
    }
}
