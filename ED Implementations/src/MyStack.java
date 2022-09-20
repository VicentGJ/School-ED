import java.util.EmptyStackException;

class MyStack<E> {

    // store elements of stack
    private MyLinkedList<E> list;
    // represent top of stack
    private int top;

    // Creating a stack
    MyStack() {
        // initialize the array
        // initialize the stack variables
        list = new MyLinkedList<>();
        top = -1;
    }

    public E peek() {
        return list.getLast();
    }

    // push elements to the top of stack
    public void push(E x) {
        // insert element on top of stack
        System.out.println("Inserting " + x);
        list.addLast(x);
        top++;
    }

    // pop elements from top of stack
    public E pop() {
        E result;
        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        // pop element from top of stack
        result = list.getLast();
        list.removeLast();
        return result;
    }

    // return size of the stack
    public int size() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }
}