package leetcode.medium;

public class set_matrix_zero {
    static void setMatrixZero(int[][] matrix){
        int n = matrix.length;      // row
        int m = matrix[0].length;   // col

        int row[] = new int[n];
        int col[] = new int[m];

        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i] = col[j] = 1;
                }
            }
        }

        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        int n = matrix[0].length;   // row
        int m = matrix.length;      // col

        setMatrixZero(matrix);

        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
