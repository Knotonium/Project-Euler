// Problem 6:
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Sum_Square_Difference {
    public static void main(String[] args) {
        int sumOfSquares = 0, squareOfSums = 0;
        for (int i = 1; i < 101; i++) {
            sumOfSquares += i*i;
        }
        
        for (int i = 1; i < 101; i++) {
            squareOfSums += i;
        }
        squareOfSums = squareOfSums * squareOfSums;

        int difference = squareOfSums - sumOfSquares;

        System.out.println(difference);
    }
}
