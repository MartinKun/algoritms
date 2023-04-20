package recursivity.fibonacci;

/**
 * These are two functions, one implemented recursively and the other iteratively,
 * to calculate the Fibonacci series, and a comparison of their execution time.
 *
 */
public class Main {

    public static void main(String[] args) {
        int n = 6;
        executionTime(() -> {
            long result = fibonacciRecursive(n);
            System.out.println("Result (recursive): " + result);
        }, n);
        executionTime(() -> {
            long result = fibonacciIterative(n);
            System.out.println("Result (iterative): " + result);
        }, n);

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

    private static void executionTime(Runnable func, int n) {
        long startTime = System.nanoTime();
        func.run();
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + (timeElapsed / 1000000));
    }
}
