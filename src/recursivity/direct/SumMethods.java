package recursivity.direct;

import recursivity.ExecutionTime;

/**
 * This class calculates the sum of digits in a natural number using recursive and iterative methods,
 * and the main method tests and prints the results with execution times.
 */

public class SumMethods {

    private static long sumRecursive(int n) {
        if (n <= 9)
            return n;
        else return sumRecursive(n / 10) + n % 10;
    }

    private static long sumIterative(int n) {
        int sum = 0;
        while (n > 9) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 256;
        ExecutionTime.print(
                () -> {
                    long result = sumRecursive(n);
                    System.out.println("Result (recursive): " + result);
                }
        );
        ExecutionTime.print(
                () -> {
                    long result = sumIterative(n);
                    System.out.println("Result (iterative): " + result);
                }
        );
    }

}
