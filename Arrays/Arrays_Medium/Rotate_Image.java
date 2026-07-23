package Arrays.Arrays_Medium;

import java.util.Arrays;

public class Rotate_Image {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(bruteforce(arr));
        System.out.println(Arrays.deepToString(optimal(arr)));
        //System.out.println(optimized(arr));

    }
    public static int[][] optimal(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0; i<mat.length; i++){
            int left = 0;
            int right = mat[0].length-1;
            while(left<right){
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
        return mat;
    }
}
