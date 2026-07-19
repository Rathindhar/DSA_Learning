package Arrays.Arrays_Medium;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, 4};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimized(arr));

    }
    public static int bruteforce(int[] arr){
        int n = arr.length;
        int longest = 1;
        for(int i=0; i<n; i++){
            int x =arr[i];
            int cnt =1;
            while(linearSearch(arr,x+1)){
                x+=1;
                cnt+=1;
            }
            longest = Math.max(cnt,longest);
        }
        return longest;
    }
    public static boolean linearSearch(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x)return true;
        }
        return false;
    }
    public static int better(int[] arr){
        Arrays.sort(arr);
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int cnt =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]-1 == lastSmaller){
                cnt +=1;
                lastSmaller = arr[i];
            }
            else if(arr[i] != lastSmaller){
                cnt =1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
    public static int optimized(int[] arr){
        HashSet<Integer> st = new HashSet<>();
        int longest =1;
        for(int i:arr){
            st.add(i);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(st.contains(x+1)){
                    x+=1;
                    cnt+=1;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}
