package algorithms.util;

import algorithms.graphs.models.Edge;
import algorithms.graphs.models.Vertex;

public class Graphs {
    public static void connectVertices(Vertex one, Vertex two) {
        Edge edge = new Edge(one, two);
        one.addEdge(edge);
        two.addEdge(edge);
    }
}
