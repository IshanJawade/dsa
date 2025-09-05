package graphs;

import java.util.ArrayList;
import java.util.List;

public class undirected_cycle_detection {

    // Create an adjecency matrix
    static List<List<Integer>> createAdjMatrix(int V, int[][] edges){
        List<List<Integer>> adj = new ArrayList<>();

        // first make empty array lists in graph list
        // this loop will add V number of empty arraylists in graph
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        // int[][] = { {first []} second []}
        for(int[] e : edges){
            int u = e[0];   // source
            int v = e[1];   // destination

            // take u'th arraylist from adj add (int) v in it
            adj.get(u).add(v); 
        }
        return adj;
    }

    // Detect cycle by DFS
    static boolean isCycleDfs(List<List<Integer>> adj, boolean[] visited, int u, int parent){
        visited[u] = true;
        
        for(int v: adj.get(u)){
            // if the current node is parant ignore it
            if(v == parent) 
                continue;
            // if current node is already visited then cycle exist
            if(visited[v]) 
                return true;
            // if cycle found in next node return ture
            if(isCycleDfs(adj, visited, v, u))
                return true;
        }
        return false;
    }

    static boolean isCycle(List<List<Integer>> adj, int V){

        // visoted array to keep track of visited nodes
        boolean[] visited = new boolean[V];

        // traverse throug all the nodes to check for cycles
        for(int i=0; i<V ;i++){
            if(!visited[i] && isCycleDfs(adj, visited, 0, -1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // number of vertices
        int V = 5;  

        // edges of a graph
        int[][] edges = {   
            {0,1},{1,2},{1,4},{2,1},{2,3},{3,2},{3,4},{4,1},{4,3}
        };

        List<List<Integer>> adj = createAdjMatrix(V, edges);

        System.err.println(isCycle(adj, V));
        
    }
}
