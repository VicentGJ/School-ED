import org.w3c.dom.Node;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterator<E> {
    private NodeLinkedList first;
    private NodeLinkedList current;
    private NodeLinkedList last;
    private int length;

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length <= 0;
    }
    @SuppressWarnings("unchecked")
    public E get(int pos) {
        NodeLinkedList currentNode;
        if (pos < size()/2) {
            currentNode = first;
            for (int i = 0; i < pos; i++) {
                currentNode = currentNode.getNext();
            }
        }
        else {
            currentNode = last;
            for (int i = 0; i < this.size()-pos-1; i++) {
                currentNode = currentNode.getPrevious();
            }
        }
        return (E) currentNode.getData();
    }

    private NodeLinkedList getNode(int pos) {
        NodeLinkedList currentNode = first;
        for (int i = 0; i < pos; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void addFirst(E data) {
        first = new NodeLinkedList(data, first, null);
        if (length == 0) {
            last = first;
        }
        else {
            first.getNext().setPrevious(first);
        }
        length++;
    }

    public void addLast(E data) {
        last = new NodeLinkedList(data, null, last);
        if (length == 0) {
            first = last;
        }
        else {
            last.getPrevious().setNext(last);
        }
        length++;
    }

    public void add(E data) {
        addFirst(data);
    }

    public void removeLast() {
        last = last.getPrevious();
    }

    public void removeFirst() {
        first = first.getNext();
    }

    @SuppressWarnings("unchecked")
    public E getFirst() {
        return (E) first.getData();
    }
    @SuppressWarnings("unchecked")
    public E getLast() {
        return (E) last.getData();
    }

    @Override
    public boolean hasNext() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        } else {
            return current != null;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public E next() {
        if (hasNext()) {
            E data = (E) current.getData();
            current = current.getNext();
            return data;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public Iterator<E> iterator() {
        current = first;
        return this;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
