package Arrays.Arrays_Easy;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,4,0};
        int[] arr1 = {1,2,0,1,0,4,0};
        System.out.println(Arrays.toString(bruteforce(arr)));
       System.out.println(Arrays.toString(optimized(arr1)));
    }
    public static int[] bruteforce(int[] arr){
        int[] res = new int[arr.length];
        int ind =0;
        for(int i:arr){
            if(i!=0) res[ind++]=i;
        }
        return res;
    }
    public static int[] optimized(int[] arr){
        int nz =0;
        for(int i: arr){
            if(i!=0) arr[nz++] = i;
        }
        while(nz <arr.length) arr[nz++] = 0;
        return arr;
    }
}
