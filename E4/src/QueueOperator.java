import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Queue;

public class QueueOperator {
    public static int addValues(Queue<Integer> queue, int n) {

        NumberFormat formatter = new DecimalFormat("###.#######");
        long start, elapsedTime;
        start = System.nanoTime();

        int result = 0;
        if (queue.isEmpty()) {
            return result;
        } else if (n > queue.size()) {
            result = -1;
        } else {
            for (int i = 0; i < n; i++) {
                result += queue.peek();
                queue.offer(queue.poll());
            }
            for (int i = 0; i < queue.size() - n; i++) {
                queue.offer(queue.poll());
            }
        }

        elapsedTime = (System.nanoTime() - start);
        System.out.println("Elapsed adding: "+formatter.format(elapsedTime / 1e9));

        return result;
    }

    public static void removeValuesBiggerThan(int value, Queue<Integer> queue) throws Exception {
        NumberFormat formatter = new DecimalFormat("###.#######");
        long start, elapsedTime;
        start = System.nanoTime();

        if (queue.isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (queue.peek() > value) {
                    queue.poll();
                }
                else {
                    queue.offer(queue.poll());
                }
            }
        }
        elapsedTime = (System.nanoTime() - start);
        System.out.println("Elapsed time removing: "+formatter.format(elapsedTime / 1e9));
    }
}
