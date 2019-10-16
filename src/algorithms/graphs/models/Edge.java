package algorithms.graphs.models;

public class Edge {
    private Vertex head;
    private Vertex tail;

    public Edge(Vertex head, Vertex tail) {
        this.head = head;
        this.tail = tail;
    }

    public Vertex getHead() {
        return head;
    }

    public Vertex getTail() {
        return tail;
    }
}
