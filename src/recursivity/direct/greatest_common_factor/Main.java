package recursivity.direct.greatest_common_factor;

import recursivity.ExecutionTime;

/**
 * This class calculates the gcf of two integers using recursive and iterative methods,
 * and the main method tests and prints the results with execution times.
 */
public class Main {

    private static long gfcRecursive(int n1, int n2) {
        if (n1 >= n2 && n1 % n2 == 0) return n2;
        return gfcRecursive(n2, n1 % n2);

    }

    private static long gfcIterative(int n1, int n2) {

        if (n1 >= n2 && n1 % n2 == 0) return n2;

        int dividend = n1;
        int divider = n2;
        while (n1 % n2 != 0) {
            dividend = n2;
            divider = n1 % n2;
            n1 = dividend;
            n2 = divider;
        }

        return dividend / divider;
    }

    public static void main(String[] args) {

        int n1 = 118;
        int n2 = 6;

        ExecutionTime.print(
                () -> {
                    long result = gfcRecursive(n1, n2);
                    System.out.println("Result (recursive): " + result);
                }
        );

        ExecutionTime.print(
                () -> {
                    long result = gfcIterative(n1, n2);
                    System.out.println("Result (iterative): " + result);
                }
        );

    }
}
