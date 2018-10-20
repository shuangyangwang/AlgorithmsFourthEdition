import edu.princeton.cs.algs4.Bag;

public class Graph {

    private final int V;
    private int E;
    private Bag<Integer>[] adj;


    public Graph(int V) {
        this.V = V;
        this.adj = (Bag<Integer>[]) new Bag[V];
        for(int v = 0; v < V; v++){
            adj[v] = new Bag<Integer>();
        }
    }
}
