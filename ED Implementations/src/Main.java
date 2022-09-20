import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(1);
        stack.push(0);
        stack.push(2);
        System.out.println(stack.pop());

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(0);
        linkedList.add(0);
        linkedList.add(0);
        linkedList.add(0);
        linkedList.add(0);
        Iterator<Integer> iterator = linkedList.iterator();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(iterator.next());
        }
    }
}