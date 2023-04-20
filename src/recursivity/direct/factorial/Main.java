package recursivity.direct.factorial;

/**
 * This is a recursive function to calculate the factorial of an integer.
 */
public class Main {

    private static long factorial(int n){
        if(n == 1) return n;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        long result = factorial(4);
        System.out.println(result);
    }
}
