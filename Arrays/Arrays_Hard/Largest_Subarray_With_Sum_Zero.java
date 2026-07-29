package Arrays.Arrays_Hard;

import java.util.HashMap;

public class Largest_Subarray_With_Sum_Zero {
    public static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimized(arr));

    }
    public static int bruteforce(int[] arr){
        int maxlen =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k=i; k<=j; k++){
                    sum+= arr[k];
                }
                if(sum == 0) maxlen = Math.max(j-i+1,maxlen);
            }
        }
        return maxlen;
    }
    public static int better(int[] arr){
        int maxlen =0;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){    
                sum+= arr[j];
                if(sum == 0) maxlen = Math.max(j-i+1,maxlen);
            }
        }
        return maxlen;
    }
    public static int optimized(int[] arr){
        HashMap<Integer,Integer> hm= new HashMap<>();
        int sum=0;
        int maxLen = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == 0){
                maxLen = i+1;
            }
            if(hm.containsKey(sum)){
                maxLen = Math.max(maxLen, i-hm.get(sum));
            }
            else{
                hm.put(sum,i);
            }
            
        }
        return maxLen;
    }

}
