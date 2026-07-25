package Arrays.Arrays_Medium;

import java.util.ArrayList;

import java.util.List;

public class Spiral_Matrix{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = solution(arr);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
    public static List<Integer> solution(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int left = 0;
        int right= m-1;
        int top = 0;
        int bottom = n-1;
        List<Integer> res = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right; i++){
                res.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom; i++){
                res.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left; i--){
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top; i--){
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}