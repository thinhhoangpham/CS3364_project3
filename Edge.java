public class Edge {
    Vertex source;
    Vertex destination;
    int weight;

    public Edge(Vertex source, Vertex destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex getSource() {
        return this.source;
    }

    public Vertex getDestination() {
        return this.destination;
    }

    public int getWeight() {
        return this.weight;
    }

    // Other methods related to Edge as needed
}
