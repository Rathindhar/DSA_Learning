package Arrays.Arrays_Easy;

import java.util.Arrays;

public class Second_Largest_Element {
    public static void main(String[] args) {
        
    }

    
    public static int bruteforce(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static int better(int[] arr){
        int lar = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > lar) lar = i;
        }
        int slar = Integer.MIN_VALUE;
        for(int i : arr){
            if(i >slar && i < lar) slar =i;
        }
        return slar;
    }
    public static int optimized(int[] arr){
        int lar = Integer.MIN_VALUE;
        int slar = Integer.MIN_VALUE;
         
    }
}
