import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackOrder {
     public static void organizeStack(Stack<Integer> originalStack) {

         if (originalStack.isEmpty()) {
             throw new EmptyStackException();
         }

        NumberFormat formatter = new DecimalFormat("###.#######");
        long start, elapsedTime;
        start = System.nanoTime();
        Stack<Integer> evenStack = new Stack<>();
        Stack<Integer> oddStack = new Stack<>();

        int size = originalStack.size();
        for (int i = 0; i < size; i++) {
            int number = originalStack.pop();
            if (number % 2 == 0) {
                evenStack.push(number);
            }
            else {
                oddStack.push(number);
            }
        }
        size = evenStack.size();
        for (int i = 0; i < size; i++) {
            originalStack.push(evenStack.pop());
        }
        size = oddStack.size();
        for (int i = 0; i < size; i++) {
            originalStack.push(oddStack.pop());
        }

        elapsedTime = (System.nanoTime() - start);
        System.out.println("Elapsed ordering: "+formatter.format(elapsedTime / 1e9));
    }
}
