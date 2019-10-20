package algorithms.graphs;

import java.util.NoSuchElementException;

public class MyQueue {
    private Node head;
    private Node tail;

    public void add(Object e) {
        Node newNode = new Node(e);

        if (head == null) {
            addFirst(newNode);
        } else {
            addLast(newNode);
        }

    }

    // removes top element from the queue
    public Object get() {
        Node nodeToReturn = head;

        if (head == null) {
            throw new NoSuchElementException();
        }

        head = head.previous;

        return nodeToReturn.value;
    }

    private void addFirst(Node newNode) {
        head = newNode;
    }

    private void addLast(Node newNode) {
        if (tail == null) {
            head.previous = newNode;
        } else {
            tail.previous = newNode;
        }

        tail = newNode;
    }

    private class Node {
        Object value;
        Node previous;

        Node(Object value) {
            this.value = value;
        }
    }
}
