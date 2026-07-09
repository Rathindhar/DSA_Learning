package Arrays.Arrays_Easy;

import java.util.HashMap;
import java.util.Map;

public class Find_The_No_Appears_Once {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimized(arr));

    }
    public static int bruteforce(int[] arr){
        
        for(int i=0;i<arr.length; i++){
            int el = arr[i];
            boolean found = true;
            for(int j = 0; j<arr.length; j++){
                if(i==j) continue;
                if(el == arr[j]){
                    found = false;
                    break;
                }
            }
            if(found) return el;
        }
        return -1;
    }
    public static int better(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i: arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :hm.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int optimized(int[] arr){
        int res =0;
        for(int i:arr){
            res^=i;
        }
        return res;
    }
}
