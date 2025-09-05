package graphs;

import java.util.*;

public class dfs_bfs {

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

    // DFS Algorithm (recursive)
    static void DFS (List<List<Integer>>adj, int u, boolean[] visited, List<Integer> result){
        // base case 
        if(visited[u]) return;

        visited[u] = true;
        result.add(u);

        for(int v: adj.get(u)){
            if(!visited[v]){
                DFS(adj, v, visited, result);
            }
        }
    }

    // BFS Algorithm (linear)
    static void BFS(List<List<Integer>>adj, int start, boolean[] visited, List<Integer> result){
        Queue<Integer> que = new ArrayDeque<>();

        visited[start] = true;
        que.add(start);
        result.add(start);  
        
        while(!que.isEmpty()){
            int u = que.poll();

            for(int v : adj.get(u)){
                if(!visited[v]){
                    visited[v] = true;
                    que.add(v);
                    result.add(v);
                }
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
        boolean[] visitedDfs = new boolean[V];
        boolean[] visitedBfs = new boolean[V];

        List<List<Integer>> adj = createAdjMatrix(V, edges);
        System.err.println(adj);

        List<Integer> dfs = new ArrayList<>();
        DFS(adj, 0, visitedDfs, dfs);
        System.err.println(dfs);

        List<Integer> bfs = new ArrayList<>();
        BFS(adj, 0, visitedBfs, bfs);
        System.err.println(bfs);
    }
}
