package algorithms.graphs.models;

import java.util.List;

public class Vertex {
    private List<Edge> edges;
    private boolean isExplored = false;
    private String name;

    public Vertex(String name) {
        this.name = name;
    }

    public Vertex(List<Edge> edges, String name) {
        this.edges = edges;
        this.name = name;
    }

    public boolean isExplored() {
        return isExplored;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }

    public void addEdges(List<Edge> edges) {
        this.edges.addAll(edges);
    }
}
