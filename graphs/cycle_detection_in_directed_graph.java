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

    // BFS Cycle Detction by using" Kahn's Algorithm "
    static boolean kahansAlgorithm(List<List<Integer>> adj, int V){

        // filling up in degreearray (How many arrays are comming towards the node)
        int[] indeg = new int[V];
        for(int i=0; i<V; i++){
            for(int v: adj.get(i)){
                indeg[v] ++;
            }
        }

        int count = 0;

        // filling up the queue with nodes with zero indegree
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0; i<V; i++){
            if(indeg[i] == 0){
                q.offer(i);
                count++;
            }
        }

        
        List<Integer> result = new ArrayList<>();
        // run the while loop util queue gets empty
        while(!q.isEmpty()){
            int u = q.poll();
            result.add(u);

            for(int v: adj.get(u)){
                indeg[v] --;
                if(indeg[v] == 0){
                    q.offer(v);
                    count++;
                }
            }
        }

        // If number of pushed in queue is equal to number of nodes
        if(count == V){
            return false;   // no cycles
        } 

        return true;
    }   

    public static void main(String[] args) {
        // number of vertices
        int V = 5;  

        // edges of a graph
        int[][] edges = {   
            {0,1},{1,2},{2,0}
        };        

        List<List<Integer>> adj = createAdjMatrix(V, edges);
        // Calling DFS Method
        System.out.println("Cycle Dtetction DFS: "+ isCycle(adj, V));
        // Calling BFS Method
        System.out.println("Cycle Dtetction BFS: "+ kahansAlgorithm(adj, V));

    }
}
