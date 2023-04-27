package recursivity.direct.hanoi_towers_stack;

import java.util.Stack;

public class Main {

    public static void hanoi(StackPair stackPairA,
                             StackPair stackPairB,
                             StackPair stackPairC,
                             int numDiscs) {

        Stack<Integer> stackA = stackPairA.getStack();
        Stack<Integer> stackC = stackPairC.getStack();
        String stackAName = (String) stackPairA.getName();
        String stackCName = (String) stackPairC.getName();

        if (numDiscs == 1) {
            int disc = stackA.pop();
            stackC.push(disc);
            System.out.printf("disc %d has been moved from %s to %s%n%n", disc, stackAName, stackCName);

        } else {
            hanoi(stackPairA, stackPairC, stackPairB, numDiscs - 1);
            int disc = stackA.pop();
            stackC.push(disc);
            System.out.printf("disc %d has been moved from %s to %s%n%n", disc, stackAName, stackCName);
            hanoi(stackPairB, stackPairA, stackPairC, numDiscs - 1);
        }

    }

    public static void main(String[] args) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        Stack<Integer> stackC = new Stack<>();

        stackA.push(3);
        stackA.push(2);
        stackA.push(1);

        StackPair stackPairA = new StackPair("stackA", stackA);
        StackPair stackPairB = new StackPair("stackB", stackB);
        StackPair stackPairC = new StackPair("stackC", stackC);

        int numDiscs = stackA.size();

        hanoi(stackPairA, stackPairB, stackPairC, numDiscs);
    }

    public static class StackPair<K, V> {
        private K name;
        private Stack<V> stack;

        public StackPair(K name, Stack<V> stack) {
            this.name = name;
            this.stack = stack;
        }

        public K getName() {
            return name;
        }

        public void setName(K name) {
            this.name = name;
        }

        public Stack<V> getStack() {
            return stack;
        }

        public void setStack(Stack<V> stack) {
            this.stack = stack;
        }
    }

}
