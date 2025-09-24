package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class number_of_connected_componenets_in_undirected_graph {

    static void dfs( List<List<Integer>> adj, boolean[] visited, int u){
        visited[u] = true;

        for(int v: adj.get(u)){
            if(visited[v] == false){
                dfs(adj, visited, v);
            }
        }
    }

    static public int countComponents(int n, int[][] edges) {

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

        // List<List<Integer>> count = new ArrayList<>();
        int count = 0;
        boolean[] visited = new boolean[n];
        for(int i=0; i< n; i++){
            if(!visited[i]){
                dfs(adj, visited, i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=3;
        int[][] edges={{0,1}, {0,2}};
        System.out.println(countComponents(n, edges));
    }
}
