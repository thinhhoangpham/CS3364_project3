import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String id;
    String name;
    List<Edge> edges;

    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Vertex destination, int weight) {
        Edge edge = new Edge(this, destination, weight);
        edges.add(edge);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Edge> getEdges() {
        return this.edges;
    }
}
