public class EJ3 {
    public void organizeStack(MyStack<Integer> originalStack) {
        MyStack<Integer> evenStack = new MyStack<>();
        MyStack<Integer> oddStack = new MyStack<>();

        for (int i = 0; i < originalStack.size(); i++) {
            int number = originalStack.pop();
            if (number % 2 == 0) {
                evenStack.push(number);
            }
            else {
                oddStack.push(number);
            }
        }
        originalStack = evenStack;
        for (int i = 0; i < oddStack.size(); i++) {
            originalStack.push(oddStack.pop());
        }
    }
}
