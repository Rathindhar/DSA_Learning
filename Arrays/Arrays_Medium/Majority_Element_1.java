package Arrays.Arrays_Medium;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element_1 {
    public static void main(String[] args) {
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimized(arr));

    }
    public static int bruteforce(int[] arr){
        int n= arr.length/2;
        for(int i=0;i<arr.length; i++){
            int cnt=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j])cnt++;
            }
            if(cnt>n) return arr[i];
        }
        return -1;
    }
    public static int better(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n= arr.length/2;
        for(int i : arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(e.getValue() > n) return e.getKey();
        }
        return -1;
    }
    public static int optimized(int[] arr){
        int cnt =0;
        int el=0;
        for(int i:arr){
            if(cnt==0){
                el=i;
                cnt=1;
            }
            else if(i==el) cnt++;
            else cnt--;
        }
        int cnt1=0;
        for(int i:arr) if(i==el) cnt1++;
        if(cnt1 > arr.length/2) return el;
        return -1;
    }
}
