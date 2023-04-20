package recursivity.direct.sum_of_integers;

/**
 * This is a recursive function that calculates the sum of the first n integers.
 */

public class Main {

    private static long sumOfIntegers(int n){
        if(n == 1) return n;
        return n + sumOfIntegers(n - 1);
    }

    public static void main(String[] args) {
        long result = sumOfIntegers(2);
        System.out.println(result);
    }

}
