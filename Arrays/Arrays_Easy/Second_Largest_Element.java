package Arrays.Arrays_Easy;

import java.util.Arrays;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimized(arr));
        
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
        for(int i : arr){
            if(i > lar){
                slar = lar;
                lar = i;
            }
            else if(i>slar && i<lar){
                slar=i;
            }
        }
        return slar; 
    }
}
