package algorithms.graphs.models;

import java.util.*;

/**
 * Graph representation as adjacency list
 */
public class Graph {
    private List<Vertex> vertices;
    private Set<Edge> edges;

    public Graph() {
        vertices = new ArrayList<>();
        edges = new HashSet<>();
    }

    public Graph(List<Vertex> vertices, Set<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public Set<Edge> getEdges() {
        return edges;
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
        edges.addAll(vertex.getEdges());
    }
}
