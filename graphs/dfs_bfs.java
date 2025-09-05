package graphs;

import java.util.*;

public class dfs_bfs {

    // Create an adjecency matrix
    static List<List<Integer>> createGraph(int V, int[][] edges){
        List<List<Integer>> graph = new ArrayList<>();

        // first make empty array lists in graph list
        // this loop will add V number of empty arraylists in graph
        for(int i=0; i<V; i++){
            graph.add(new ArrayList<>());
        }
        // int[][] = { {first []} second []}
        for(int[] e : edges){
            int u = e[0];   // source
            int v = e[1];   // destination

            // take u'th arraylist from graph add (int) v in it
            graph.get(u).add(v); 
        }
        return graph;
    }

    static void DFS (List<List<Integer>>graph, int u, boolean[] visited, List<Integer> dfs){
        // base case 
        if(visited[u]) return;

        visited[u] = true;
        dfs.add(u);

        for(int v: graph.get(u)){
            if(!visited[v]){
                DFS(graph, v, visited, dfs);
            }
        }
    }

    public static void main(String[] args) {
        // number of vertices
        int V = 7;  

        // edges of a graph
        int[][] edges = {   
            {0,1},{0,2},{1,3},{1,4},{2,5},{2,6}
        };

        // Boolean array to track of visited nodes
        boolean[] visited = new boolean[V];

        List<List<Integer>> graph = createGraph(V, edges);
        System.err.println(graph);

        List<Integer> dfs = new ArrayList<>();
        DFS(graph, 0, visited, dfs);
        System.err.println(dfs);

        // List<Integer> bfs = new ArrayList<>();
        // BFS(graph, 0, visited, bfs);
        // System.err.println(bfs);
    }
}
