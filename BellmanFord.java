import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BellmanFord {
    Graph g;
    Vertex s;
    // make dist and prev array as hashmaps
    Map<Vertex, Integer> dist = new HashMap<>();
    Map<Vertex, Vertex> prev = new HashMap<>();

    //Contructor
    public BellmanFord(Graph g, Vertex s) {
        this.g = g;
        this.s = s;

        for (Vertex v : g.getVertices()) {
            dist.put(v, Integer.MAX_VALUE);
            prev.put(v, null);
        }
    }

    public void findPath() {
        dist.put(s, 0);
        for (int i = 0; i < g.getVertices().size() - 1; i++) {
            for (Vertex u : g.getVertices()) {
                for (Edge e : u.getEdges()) {
                    Vertex v = e.getDestination();
                    int l = e.getWeight();
                    int alt = dist.get(u) + l;
                    if (dist.get(v) > alt) {
                        dist.put(v, alt);
                        prev.put(v, u);
                    }
                }
            }
        }
    }

    public int getDist(Vertex d) {
        return this.dist.get(d);
    }

    public void printShortestPath(Vertex source, Vertex destination) {
        List<Vertex> path = new ArrayList<>();
        for (Vertex v = destination; v != null; v = prev.get(v)) {
            path.add(v);
        }
        Collections.reverse(path);

        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i).getId());
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
