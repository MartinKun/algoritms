package recursivity.direct.hanoi_towers;

public class Main {

    private static void hanoi( int n, char initialBar, char centralBar, char finalBar)
    {
        if(n == 1) {
            System.out.printf("Move disk %d from bar %s to bar %s%n%n",n, initialBar, finalBar);
        } else {
            hanoi(n-1, initialBar, finalBar, centralBar);
            System.out.printf("Move disk %d from bar %s to bar %s%n%n",n, initialBar, finalBar);
            hanoi(n-1, centralBar, initialBar, finalBar);
        }

    }

    public static void main(String[] args) {
        hanoi(3,'A', 'B', 'C');
    }
}
