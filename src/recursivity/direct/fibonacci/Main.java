package recursivity.direct.fibonacci;

import recursivity.ExecutionTime;

/**
 * These are two functions, one implemented recursively and the other iteratively,
 * to calculate the Fibonacci series, and a comparison of their execution time.
 *
 */
public class Main {

    public static void main(String[] args) {
        int n = 6;
        ExecutionTime.print(() -> {
            long result = fibonacciRecursive(n);
            System.out.println("Result (recursive): " + result);
        });
        ExecutionTime.print(() -> {
            long result = fibonacciIterative(n);
            System.out.println("Result (iterative): " + result);
        });

    }

    private static long fibonacciRecursive(int n){

        if(n < 0) throw new RuntimeException("n can't be negative.");

        if(n == 0 || n == 1) return n;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    private static long fibonacciIterative(int n){
        if (n == 0 || n == 1)
            return n;
        int fibinf = 0;
        int fibsup = 1;
        for (int i = 2; i <= n; i++)
        {
            int x;
            x = fibinf;
            fibinf = fibsup;
            fibsup = x + fibinf;
        }
        return (fibsup);
    }

}
