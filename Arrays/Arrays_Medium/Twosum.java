package Arrays.Arrays_Medium;

import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        int[] a = {9, -3, 3, -1, 6, -5};
        int target = 14;
        System.out.println(bruteforce(arr , target));
        System.out.println(better(arr, target));
        //System.out.println(optimized(arr));

    }
    public static int[] bruteforce(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] better(int[] arr, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complement = target-arr[i];
            if(hm.containsKey(complement)) return new int[] {i,hm.get(complement)};
            hm.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}
