package leetcode.medium;

import java.util.*;

public class pacific_atlantic_waterflow {
	static int m;
	static int n;
	static boolean[][] pac ;
	static boolean[][] atl ;	
	
	public static List<List<Integer>> pacificAtlantic(int[][] heights) {
		m = heights.length;		// row
		n = heights[0].length;	// col

		
		// for pacific ocean
		pac = new boolean[m][n];	// visited array	  // using Int min to start first DFS call
		for(int i=0; i<m; i++)	dfs(heights, i, 0, pac, Integer.MIN_VALUE );	// top row
		for(int i=0; i<n; i++)	dfs(heights, 0, i, pac, Integer.MIN_VALUE);	// left column
		
		// for atlantic ocean
		atl = new boolean[m][n];	// visited array
		for(int i=0; i<m; i++)	dfs(heights, i, n-1, atl, Integer.MIN_VALUE);	// bottom row
		for(int i=0; i<n; i++)	dfs(heights, m-1, i, atl, Integer.MIN_VALUE);	// right column

		// collect cells that reach both oceans
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(pac[i][j] && atl[i][j]){
					result.add(Arrays.asList(i,j));
				}
			}
		}
		
		return result;
    }
	
	static void dfs(int[][] heights, int i, int j, boolean[][] visited, int prev) {

		// base cases
		if(i<0 || i>=m || j<0 || j>=n) return;	// if going out of bounds
		if(visited[i][j]) return;				// if already visited	
		if(heights[i][j]< prev) return; 		// if cannot go up

		int cur = heights[i][j];
		visited[i][j] =  true;

		dfs(heights, i+1, j, visited, cur);
		dfs(heights, i-1, j, visited, cur);
		dfs(heights, i, j+1, visited, cur);
		dfs(heights, i, j-1, visited, cur);
	}

	public static void main(String[] args) {
		int[][] heights = {
			{1,2,2,3,5},
			{3,2,3,4,4},
			{2,4,5,3,1},
			{6,7,1,4,5},
			{5,1,1,2,4}
		};

		List<List<Integer>> result = pacificAtlantic(heights);
		System.out.println(result);
	}
}