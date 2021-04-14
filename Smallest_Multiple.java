// Problem 5:
// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Smallest_Multiple {
    public static void main(String[] args) {
        long dividend = 100000;
        int divisor = 1;
        while (true) {
            if (dividend % divisor == 0) {
                divisor++;
                if (divisor==20) {
                    System.out.println(dividend);
                    break;
                }
            } else {
                dividend++;
                divisor = 1;
            }
        }
    }
}


