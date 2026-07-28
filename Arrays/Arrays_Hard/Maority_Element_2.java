package Arrays.Arrays_Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maority_Element_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        //System.out.println(optimized(arr));

    }
    public static List<Integer> bruteforce(int[] arr){
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            for(int j=i; j<arr.length; j++){
                if(arr[i] == arr[j])cnt++;
            }
            if(cnt > arr.length/3) res.add(arr[i]);
        }
        return res;
    }
    public static List<Integer> better(int[] arr){
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > arr.length/3) res.add(entry.getKey());
        }
        return res;
    }
}
