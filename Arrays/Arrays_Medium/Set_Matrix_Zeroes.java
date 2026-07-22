package Arrays.Arrays_Medium;

import java.util.Arrays;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] arr1 = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(Arrays.deepToString(bruteforce(arr1)));
        int[][] arr2 = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(Arrays.deepToString(better(arr2)));
        int[][] arr3 = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(Arrays.deepToString(optimized(arr3)));

    }
    public static int[][] bruteforce(int[][] mat){
        int n= mat.length;
        int m = mat[0].length;
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    for(int row=0;row<n;row++){
                        if(mat[row][j] != 0) mat[row][j]=-1;
                    }
                    for(int col=0;col<n;col++){
                        if(mat[i][col] != 0) mat[i][col]=-1;
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == -1) mat[i][j] = 0;
            }
        }
        return mat;
    }
    public static int[][] better(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    row[i] =1;
                    col[j] =1;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                if(row[i] == 1 || col[j] == 1){
                    mat[i][j] = 0;
                }
            }
        } 
        return mat;

    }
    public static int[][] optimized(int[][] mat){
        int n = mat.length;
        int m = mat.length;
        boolean firstRow = false;
        boolean firstCol = false;
        for(int i=1; i<n;i++){
            for(int j=1; j<m; j++){
                if(mat[i][j] == 0){
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
        for(int i=0; i<m; i++){
            if(mat[0][i] == 0){
                firstRow = true;
                break;
            }
        }
        for(int i=0; i<n; i++){
            if(mat[i][0] == 0){
                firstCol = true;
                break;
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(mat[0][j] == 0 || mat[i][0]==0) mat[i][j] = 0;
            }
        }
        if(firstRow){
            for(int i=0; i<m; i++) mat[0][i] = 0;
        }
        if(firstCol){
            for(int i=0; i<n; i++) mat[i][0] = 0;
        }
        return mat;
    }
}
