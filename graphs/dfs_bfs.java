package graphs;

import java.util.*;

public class dfs_bfs {
    static void dfs(int v, List<List<Integer>> adj, List<Boolean> visited, List<Integer> result){
        if(visited.get(v)){
            return;
        }

        visited.add(v, true);

        for(var a: adj){
            if(visited.get(a))
        }
    }

    static void bfs(int v, List<List<Integer>> adj, List<Boolean> visited, List<Integer> result){

    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(2)));
    
        List<Boolean> visited = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        dfs(V, adj, visited, result);
        bfs(V, adj, visited, result);
    }
}
