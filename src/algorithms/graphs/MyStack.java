package algorithms.graphs;

import java.util.NoSuchElementException;

public class MyStack {
    private Node head;
    private Node tail;

    public void add(Object e) {
        Node newNode = new Node(e);

        if (tail == null) {
            tail = newNode;
            head = newNode;
            head.previous = tail;
        } else {
            newNode.previous = head;
            head = newNode;
        }
    }

    // this method returns top object and removes it from the stack
    public Object get() {
        if (tail == null) {
            throw new NoSuchElementException();
        }

        
    }


    private class Node {
        Object value;
        Node previous;

        Node(Object value) {
            this.value = value;
        }
    }
}
