package algorithms.graphs;

public class MyQueue {
    private Node head;
    private Node tail;

    public void add(Object e) {
        Node newNode = new Node(e);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.previous = newNode;
            tail.next = newNode;
        } else {
            tail.previous = newNode;
            newNode.next = tail;
            tail = newNode;
        }

    }

    // removes top element from the queue
    public Object get() {
        Node nodeToReturn = head;

        if (head == null) {
            return new Object();
        }

        head.previous.next = null;
        head = head.previous;

        return nodeToReturn.value;
    }


    private class Node {
        Object value;
        Node previous;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }
}
