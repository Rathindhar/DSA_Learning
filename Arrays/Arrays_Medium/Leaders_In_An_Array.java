package Arrays.Arrays_Medium;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_In_An_Array {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> res = bruteforce(arr);
        for(int i: res) System.out.println(i);
        ArrayList<Integer> res1 = optimized(arr);
        for(int i: res1) System.out.println(i);
    }
    public static ArrayList<Integer> bruteforce(int[] arr){
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            boolean found = true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] >= arr[i]) {
                    found = false;
                    break;
                }
            }
            if(found) li.add(arr[i]);

        }
        return li;
    }
    public static ArrayList<Integer> optimized(int[] arr){
        int maxRight = Integer.MIN_VALUE;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > maxRight){
                li.add(arr[i]);
                maxRight  = arr[i];
            } 
        }
        Collections.reverse(li);
        return li;
    }
}
