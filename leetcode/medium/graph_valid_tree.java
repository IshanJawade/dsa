package leetcode.medium;

import java.util.*;

public class graph_valid_tree {

    static boolean cycleDsf(List<List<Integer>> adj, boolean[] visited, int u, int parant){
        visited[u] = true;

        for(int v: adj.get(u)){
            if(v == parant)
                continue;
            if(visited[v])
                return true;
            if(cycleDsf(adj, visited, v, u))
                return true;
        }
        return false;
    }
    
    public static boolean validTree(int n, int[][] edges) {
        // if array length is not n-1 return false
        if (edges.length != n - 1) return false;

        List<List<Integer>> adj = new ArrayList<>(n);

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] i : edges){
            int u = i[0];
            int v = i[1];
            adj.get(u).add(v);
            adj.get(v).add(u);  
        }

        boolean[] visited = new boolean[n];
        // if cycle found return false
        if(cycleDsf(adj, visited, 0, -1))
            return false;
        
        // check visited array to see all nodes are visited or not
        for(boolean seen: visited){
            if(!seen) 
                return false;
        }

        return true;    // means graph is connected and uncyclic
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}};
        System.out.println(validTree(n, edges));
    }
}
