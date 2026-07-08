package Arrays.Arrays_Easy;

import java.util.HashSet;

public class Remove_Duplicates_Inplace_In_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        System.out.println(bruteforce(arr));
        System.out.println(optimized(arr));
    }
    public static int bruteforce(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        return set.size();
    }
    public static int optimized(int[] arr){
        int prev = arr[0];
        int cnt =1;
        if(arr.length == 1) return 1;
        for(int i=1;i<arr.length; i++){
            if(arr[i] == prev) continue;
            cnt++;
            prev=arr[i];
        }
        return cnt;
    }
}
