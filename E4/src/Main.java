import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        System.out.println("Original Queue state: " + queue);
        int pos = 4;
        System.out.println("The sum of the first " + pos + " elements: " + QueueOperator.addValues(queue, pos));
        System.out.println("Queue state after operations: " + queue);

        try {
            int compareValue = 3;
            QueueOperator.removeValuesBiggerThan(compareValue, queue);
            System.out.println("Queue without values bigger than " + compareValue + ": " + queue);
        } catch (Exception e) {
            System.out.println("The list appears to be empty");
        }
    }
}