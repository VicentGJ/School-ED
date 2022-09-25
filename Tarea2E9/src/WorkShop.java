import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class WorkShop {
    private Queue<Client> clientQueue;
    private Queue<Client> pendingQueue;

    public WorkShop() {
        this.clientQueue = new ArrayDeque<>();
        this.pendingQueue = new ArrayDeque<>();
    }
    public void addClient(Client newClient) {

    }

}
