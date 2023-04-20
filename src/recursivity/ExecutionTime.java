package recursivity;

/**
 * This class defines a single method to measure and print the execution time of a given function
 * in both nanoseconds and milliseconds.
 */

public class ExecutionTime {

    public static void print(Runnable func) {
        long startTime = System.nanoTime();
        func.run();
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + (timeElapsed / 1000000));
    }
}
