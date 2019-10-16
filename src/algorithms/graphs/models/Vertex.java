package algorithms.graphs.models;

import java.util.List;

public class Vertex {
    private List<Edge> edges;
    private boolean isExplored = false;
    private String name;

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
}
