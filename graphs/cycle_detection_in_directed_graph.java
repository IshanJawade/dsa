package graphs;

import java.util.*;

public class cycle_detection_in_directed_graph {

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

    // DFS
    static boolean isCycleDFS(List<List<Integer>> adj, boolean[] visited, boolean[] inRec, int u){
        visited[u] = true;
        inRec[u] = true;

        for(int v: adj.get(u)){
            if(visited[v] == false && isCycleDFS(adj, visited, inRec, v)){
                return true;
            }  
            else if(inRec[v] == true){
                return true;
            }
        }
        inRec[u] = false;
        return false;
    }

    static boolean isCycle(List<List<Integer>> adj, int V){

        boolean[] visited1 = new boolean[V];
        boolean[] inRec1 = new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited1[i] && isCycleDFS(adj, visited1, inRec1, 0)){
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
            {0,1},{1,2},{2,0}
        };        

        List<List<Integer>> adj = createAdjMatrix(V, edges);
        System.out.println(isCycle(adj, V));
    }
}
