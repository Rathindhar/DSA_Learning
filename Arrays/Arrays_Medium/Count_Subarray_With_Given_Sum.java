package Arrays.Arrays_Medium;

import java.util.HashMap;

public class Count_Subarray_With_Given_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(bruteforce(arr,k));
        System.out.println(better(arr,k));
        System.out.println(optimized(arr,k));

    }
    public static int bruteforce(int[] arr, int k){
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i;j<arr.length; j++){
                int sum =0;
                for(int l=i; l<=j; l++){
                    sum += arr[l];
                }
                if(sum == k) cnt++;
            }
        }
        return cnt;
    }
    public static int better(int[] arr, int k){
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum == k) cnt++;
            }
        }
        return cnt;
    }
    public static int optimized(int[] arr, int k){
        HashMap<Integer,Integer> hm= new HashMap<>();
        hm.put(0,1);
        int preSum=0;
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            int remove = preSum-k;
            if(hm.containsKey(remove)){
                cnt += hm.get(remove);
            }
            hm.put(preSum,hm.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }
    
}
