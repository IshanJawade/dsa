package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class topological_sorting {

     // Create an adjecency List
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
    // DFS Topology recursive algorithm
    static void topologicalSort( List<List<Integer>> adj, boolean[] visited, Deque<Integer> st, int u){
        visited[u] = true;
        
        // first push all the V's in the stack
        for(int v : adj.get(u)){
            if(visited[v] == false){
                topologicalSort(adj, visited, st, v);
            }
        }
        // push u at the end 
        st.push(u);
    }

    public static void main(String[] args) {
        // number of vertices
        int V = 6;  

        // edges of a graph
        int[][] edges = {   
            {0,3},{0,2},{1,4},{2,3},{2,1},{3,1},{5, 1},{5,4}
        };

        List<List<Integer>> adj = createAdjMatrix(V, edges);
        boolean[] visited = new boolean[V];
        Deque<Integer> stack = new ArrayDeque<>();
        // traverse through the graph
        for(int i=0; i<V; i++){
            if(visited[i] == false){
                topologicalSort(adj, visited, stack, i);
            }
        }

        System.out.println(stack);
    }
}
