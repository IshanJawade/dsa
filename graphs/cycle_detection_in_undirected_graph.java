package graphs;

import java.util.*;

public class cycle_detection_in_undirected_graph {

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
            adj.get(v).add(u);  // reverse pair for undirected graph
        }
        return adj;
    }

    // Detect cycle by DFS
    static boolean isCycleDFS(List<List<Integer>> adj, boolean[] visited, int u, int parent){
        visited[u] = true;
        
        for(int v: adj.get(u)){
            // if the current node is parant ignore it
            if(v == parent) 
                continue;
            // if current node is already visited then cycle exist
            if(visited[v]) 
                return true;
            // if cycle found in next node return true
            if(isCycleDFS(adj, visited, v, u))
                return true;
        }
        return false;
    }

    // Detect cycle by BFS
    static boolean isCycleBFS(List<List<Integer>> adj, boolean[] visited, int u){
        Queue<int[]> qu = new ArrayDeque<>();

        // adding first element in que
        qu.offer(new int[]{u, -1});
        visited[u] = true;

        while(!qu.isEmpty()){
            // takeout head of the queue in pair
            int[] pair = qu.poll();

            int source = pair[0];
            int parent = pair[1];

            for(int v: adj.get(source)){
                if(visited[v] == false){
                    visited[v] = true;
                    qu.offer(new int[]{v, source});
                } else if(v != parent){
                    return true;
                }
            }
        }
        return false;
    }

    /*
    Comment the code which you dint want to run
     */
    static boolean isCycle(List<List<Integer>> adj, int V){

        // DFS
        boolean[] visited = new boolean[V];
        for(int i=0; i<V ;i++){
            if(!visited[i] && isCycleDFS(adj, visited, 0, -1)){
                System.err.println("DFS: True!");
                return true;
            }
        }

        // BFS
        boolean[] visited2 = new boolean[V];
        for(int i=0; i<V ;i++){
            if(!visited2[i] && isCycleBFS(adj, visited2, 0)){
                System.err.println("BFS: True!");
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

        System.out.println(isCycle(adj, V));   
    }
}
