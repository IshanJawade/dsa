package leetcode.medium;

public class surrounded_regions {

	static int m ;
	static int n ;

	// detection of non-surrounded regions
	static void dfs(char[][] board, int i, int j, char find, char change){

		//base-case (Not Found)
		if(i<0 || i>=m || j<0 || j>=n || board[i][j] != find)
			return;

		// Change 
		board[i][j] = change;

		dfs(board, i+1, j, find, change);
		dfs(board, i-1, j, find, change);
		dfs(board, i, j+1, find, change);
		dfs(board, i, j-1, find, change);	
	}

	static public void solve(char[][] board) {
		m = board.length;	// row
		n = board[0].length;// col

		// change non-surrounded 'O' into 'T'
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if (i == 0 || i == m - 1 || j == 0 || j == n - 1){
					if(board[i][j] == 'O'){
						dfs(board, i, j, 'O', 'T');
					}
				}
			}
		}

		// chnage surrounded 'O' into 'X'
		for(int i =0; i<m; i++){
			for(int j=0; j<n; j++){
				if(board[i][j] == 'O'){
					dfs(board, i, j, 'O', 'X');
				}
			}
		}

		// chanage all the 'T' into 'O'
		for(int i =0; i<m; i++){
			for(int j=0; j<n; j++){
				if(board[i][j] == 'T'){
					dfs(board, i, j, 'T', 'O');
				}
			}
		}
	}

	public static void main(String[] args) {
		char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		solve(board);

		for (int i = 0; i < m; i++) {
    		for (int j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
    		System.out.println();
		}
	}
}
