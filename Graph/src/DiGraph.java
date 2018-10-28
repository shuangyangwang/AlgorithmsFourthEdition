import edu.princeton.cs.algs4.Bag;

import java.util.Iterator;

public class DiGraph {
    private final int V;
    private  final Bag<Integer>[] adj;

    public DiGraph(int V){
        this.V = V;
        adj = (Bag<Integer>[])new Bag[V];
        for (int v = 0 ; v < V; v++){
            adj[v] = new Bag<Integer>();
        }
    }

    public void addEdge(int v,int w){
        adj[v].add(w);
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }
//
//    public DiGraph reverse(DiGraph G){
//        for(int i = 0; i < V; i++){
//
//        }
//    }

    public static void main(String[] args) {
        int V =13;
        DiGraph graph = new DiGraph(V);
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
        Iterator<Integer> v_adjI = v_adj.iterator();
        while(v_adjI.hasNext()){
            System.out.println(v_adjI.next());
        }


    }

}
