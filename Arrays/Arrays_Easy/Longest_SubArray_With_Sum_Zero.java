package Arrays.Arrays_Easy;

import java.util.HashMap;

public class Longest_SubArray_With_Sum_Zero {
    public static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        int[] a = {9, -3, 3, -1, 6, -5};
        System.out.println(bruteforce(arr));
        System.out.println(bruteforce(a));
        System.out.println(optimized(arr));
    }
    public static int bruteforce(int[] arr){
        int maxLen=0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i;j<n; j++){
                sum+=arr[j];
                if(sum == 0) maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }
    public static int optimized(int[] arr){
        HashMap<Integer,Integer> h =  new HashMap<>();
        int sum = 0;
        int maxLen =0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum == 0){
            maxLen = i + 1;
            }
            
            if(h.containsKey(sum)){
                int len = i-h.get(sum);
                maxLen = Math.max(maxLen,len);
            }
            else{
                h.put(sum, i);
            }
        }
        return maxLen;
    }
}
