package recursivity.indirect;

/**
 * Here are two recursive functions that call each other to print the alphabet,
 * up to the character passed in the first method.
 */
public class Alphabet {

    private static void methodA(char c){

        if(c > 'A'){
            methodB(c);
            System.out.println(c);
            return;
        }
        System.out.println(c);

    }

    private static void methodB(char c){
        methodA(--c);
    }

    public static void main(String[] args) {
        methodA('Z');
    }
}
