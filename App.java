
public class App {

    
    public static void main(String[] args) {
        
        // Create graph
        Graph g = makeGraph();
        Vertex source = g.getVertex("CS");

        

        Dijkstra dijkstra = new Dijkstra(g, source);
        BellmanFord bf = new BellmanFord(g, source);
        dijkstra.findPath();
        bf.findPath();

        for (Vertex v : g.getVertices()) {
            System.out.println("(Dijkstra)\tShortest distance from " + source.getName() + " to " + v.getName() + " is " + dijkstra.getDist(v));
            System.out.print("(Dijkstra)\tShortest path: ");
            dijkstra.printShortestPath(source, v);
            System.out.println("(BellmanFord)\tShortest distance from " + source.getName() + " to " + v.getName() + " is " + bf.getDist(v));
            System.out.print("(BellmanFord)\tShortest path: ");
            bf.printShortestPath(source, v);
            System.out.println();
        }
    }

    static Graph makeGraph() {
        Graph g = new Graph();

        // Create vertices
        Vertex cs = new Vertex("CS", "Computer Science");
        Vertex ls = new Vertex("LS", "Lewis Science Center");
        Vertex tl = new Vertex("TL", "Torreyson Library");
        Vertex pc = new Vertex("PC", "Prince Center");
        Vertex bu = new Vertex("BU", "Burdick");
        Vertex csq = new Vertex("CSQ", "College Square");
        Vertex slh = new Vertex("SLH", "Speech Language Hearing");
        Vertex om = new Vertex("OM", "Old Main");
        Vertex pd = new Vertex("PD", "Police Dept.");
        Vertex fa = new Vertex("FA", "Fine Art");
        Vertex mah = new Vertex("MAH", "McALister Hall");
        Vertex mc = new Vertex("MC", "Maintenance College");
        Vertex sc = new Vertex("SC", "Student Center");
        Vertex shc = new Vertex("SHC", "Student Health Center");
        Vertex wg = new Vertex("WG", "Wingo");
        Vertex nb = new Vertex("NB", "New Business Building");
        Vertex ot = new Vertex("OT", "Oak Tree Apt.");
        Vertex bh = new Vertex("BH", "Brewer-Hegeman");
        Vertex bv = new Vertex("BV", "Bear Village Apt.");


        // Add vertices to graph
        g.addVertex(cs);
        g.addVertex(ls);
        g.addVertex(tl);
        g.addVertex(pc);
        g.addVertex(bu);
        g.addVertex(csq);
        g.addVertex(slh);
        g.addVertex(om);
        g.addVertex(pd);
        g.addVertex(fa);
        g.addVertex(mah);
        g.addVertex(mc);
        g.addVertex(sc);
        g.addVertex(shc);
        g.addVertex(wg);
        g.addVertex(nb);
        g.addVertex(ot);
        g.addVertex(bh);
        g.addVertex(bv);

        // Add adjacent edges to each vertex
        cs.addEdge(ls, 150);
        cs.addEdge(bu, 30);
        cs.addEdge(tl, 40);
        cs.addEdge(pc, 80);
        ls.addEdge(cs, 150);
        ls.addEdge(csq, 200);
        ls.addEdge(slh, 250);
        tl.addEdge(cs, 40);
        tl.addEdge(bu, 80);
        tl.addEdge(pc, 30);
        tl.addEdge(om, 30);
        pc.addEdge(cs, 80);
        pc.addEdge(tl, 30);
        pc.addEdge(csq, 300);
        pc.addEdge(pd, 100);
        bu.addEdge(cs, 30);
        bu.addEdge(tl, 80);
        bu.addEdge(slh, 100);
        bu.addEdge(mc, 300);
        bu.addEdge(mah, 200);
        csq.addEdge(ls, 200);
        csq.addEdge(pc, 300);
        slh.addEdge(ls, 250);
        slh.addEdge(bu, 100);
        slh.addEdge(mc, 120);
        om.addEdge(tl, 30);
        om.addEdge(pd, 200);
        om.addEdge(fa, 90);
        om.addEdge(mah, 100);
        pd.addEdge(pc, 100);
        pd.addEdge(om, 200);
        pd.addEdge(fa, 50);
        pd.addEdge(shc, 100);
        fa.addEdge(om, 90);
        fa.addEdge(pd, 50);
        fa.addEdge(mah, 180);
        fa.addEdge(sc, 80);
        mah.addEdge(fa, 180);
        mah.addEdge(om, 100);
        mah.addEdge(sc, 100);
        mah.addEdge(bu, 200);
        mah.addEdge(mc, 150);
        mah.addEdge(wg, 50);
        mc.addEdge(slh, 120);
        mc.addEdge(bu, 300);
        mc.addEdge(mah, 150);
        mc.addEdge(wg, 100);
        mc.addEdge(nb, 150);
        mc.addEdge(ot, 160);
        sc.addEdge(fa, 80);
        sc.addEdge(shc, 50);
        sc.addEdge(mah, 100);
        sc.addEdge(wg, 100);
        sc.addEdge(nb, 110);
        shc.addEdge(pd, 100);
        shc.addEdge(sc, 50);
        shc.addEdge(bh, 200);
        wg.addEdge(mah, 50);
        wg.addEdge(sc, 100);
        wg.addEdge(mc, 100);
        wg.addEdge(nb, 50);
        nb.addEdge(sc, 110);
        nb.addEdge(wg, 50);
        nb.addEdge(mc, 150);
        nb.addEdge(ot, 30);
        nb.addEdge(bh, 20);
        ot.addEdge(mc, 160);
        ot.addEdge(nb, 30);
        ot.addEdge(bh, 40);
        bh.addEdge(shc, 200);
        bh.addEdge(nb, 20);
        bh.addEdge(ot, 40);
        bh.addEdge(bv, 350);
        bv.addEdge(bh, 350);

        return g;
    }

}
