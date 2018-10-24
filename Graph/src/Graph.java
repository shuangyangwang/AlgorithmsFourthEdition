import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import edu.princeton.cs.algs4.Bag;

import java.util.Iterator;

public class Graph {

    private final int V;
    private int E;
    private Bag<Integer>[] adj;


    public Graph(int V) {
        this.V = V;
        this.adj = (Bag<Integer>[]) new Bag[V];
        for(int v = 0; v < V; v++){
            adj[v] = new Bag<>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public int V(){return V;}
    public int E(){return E;}

    public Iterable<Integer> adj(int v){
        return adj[v];
    }

    public static void main(String[] args) {
        int V = 13;
        int E = 13;
        Graph graph = new Graph(V);

        graph.addEdge(0,5);
        graph.addEdge(4,3);
        graph.addEdge(0,1);
        graph.addEdge(9,12);
        graph.addEdge(6,4);
        graph.addEdge(5,4);
        graph.addEdge(0,2);
        graph.addEdge(11,12);
        graph.addEdge(9,10);
        graph.addEdge(0,6);
        graph.addEdge(7,8);
        graph.addEdge(9,11);
        graph.addEdge(5,3);
        Iterable<Integer> v_adj = graph.adj(0);
        Iterator<Integer>  v_adjI = v_adj.iterator();
        while(v_adjI.hasNext()){
            System.out.println(v_adjI.next());
        }


    }

}
