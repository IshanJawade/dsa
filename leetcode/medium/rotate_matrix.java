package leetcode.medium;

public class rotate_matrix {
    static int[][] rotateMatrixBrut(int[][] matrix){
        int m = matrix.length;
        int[][] d_matrix = new int[m][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                d_matrix[j][m-1-i] = matrix[i][j];
            }
        }
        return d_matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length;
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println("\n");

        matrix = rotateMatrixBrut(matrix);
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println("\n");
    }
}
