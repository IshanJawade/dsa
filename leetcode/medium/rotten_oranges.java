package leetcode.medium;

import java.util.*;

public class rotten_oranges {

	static int m;
	static int n;

	public int orangesRotting(int[][] grid) {
		m = grid.length;
		n = grid[0].length;

		// to store coordinates of the cell
		Queue<List<Integer>> que = new ArrayDeque<>();
		int freshCount = 0;

		// find freshCount and rotten oranges
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(grid[i][j] == 2){
					que.add(Arrays.asList(i,j));
				} else if(grid[i][j] == 1){
					freshCount++;
				}
			}
		}
		
		// All oranges are already rotten
		if(freshCount == 0) return 0;

		// 		directions	  left		right	 up		down
		int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		int time = 0;

		// Multi-source BFS
		while(!que.isEmpty()){
			int size = que.size();
			while(size-- > 0){
				List<Integer> cur = que.poll();
				int x = cur.get(0); 
				int y = cur.get(1); 

				for(int[] dir: directions){
					int newX = x + dir[0];
					int newY = y + dir[1];

					if(newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == 1){
						grid[newX][newY] = 2; // mark as rotten
						que.offer(new ArrayList<>(Arrays.asList(newX, newY)));
						freshCount --;
					}
				}
			}
			time ++;
		}
		if(freshCount == 0)
			return time;
		
		return -1;
    }
}
