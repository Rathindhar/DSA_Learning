package Arrays.Arrays_Easy;

import java.util.HashMap;

public class Longest_SubArray_With_Given_Sum_K {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(bruteforce(arr,k));
        System.out.println(better(arr, k));
        System.out.println(optimized(arr,k));

    }
    public static int bruteforce(int[] arr, int k){
        int maxCount = 0;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=i; j<arr.length; j++){
                sum +=arr[j];
                
                if(sum == k){
                    maxCount = Math.max(j-i+1,maxCount);
                }
                if(sum >k ) break;
            }
        }
        return maxCount;
    }
    public static int better(int[] nums, int k){
        HashMap<Long,Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            long rem = sum-k;
            if(preSumMap.containsKey(rem)){
                int len = i-preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
            
        }
        return maxLen;
    }
    public static int optimized(int[] arr, int k){
        int left =0;
        int right=0;
        int maxCount = 0;
        int sum = 0;
        while(right<arr.length){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum == k) maxCount = Math.max(maxCount, right-left+1);
            right++;
        }
        return maxCount;
    }
}
