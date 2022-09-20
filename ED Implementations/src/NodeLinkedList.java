import org.w3c.dom.Node;

public class NodeLinkedList {
    private Object data;
    private NodeLinkedList next;
    private NodeLinkedList previous;

    public NodeLinkedList (Object data, NodeLinkedList next, NodeLinkedList previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodeLinkedList getNext() {
        return next;
    }

    public NodeLinkedList getPrevious() {
        return previous;
    }

    public void setPrevious(NodeLinkedList previous) {
        this.previous = previous;
    }

    public void setNext(NodeLinkedList next) {
        this.next = next;
    }
}
