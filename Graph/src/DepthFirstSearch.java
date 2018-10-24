public class DepthFirstSearch {
    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph G,int v){
        marked = new boolean[G.V()];
        dfs(G,v);
    }

    public void dfs(Graph G, int v){
        marked[v] = true;
        count++;
        for(int w:G.adj(v)){
            if(!marked[w]){
                dfs(G,w);
            }
        }
    }

    public int count(){
        return count;
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

        DepthFirstSearch DFS = new DepthFirstSearch(graph,0);
        System.out.println(DFS.count());
    }

}
