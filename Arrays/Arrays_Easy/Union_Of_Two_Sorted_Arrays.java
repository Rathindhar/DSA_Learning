package Arrays.Arrays_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union_Of_Two_Sorted_Arrays{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        System.out.println(Arrays.toString(bruteforce(arr1, arr2)));
       System.out.println(Arrays.toString(optimized(arr1,arr2)));
    }
    public static int[] bruteforce(int[] arr1, int[] arr2){
        Set<Integer> s = new HashSet<>();
        for(int i:arr1){s.add(i);}
        for(int i:arr2){s.add(i);}
        int[] res = new int[s.size()];
        int i=0;
        for(int e: s){
            res[i++]=e;
        }
        Arrays.sort(res);
        return res;
    }
    public static int[] optimized(int[] arr1, int[] arr2){
        ArrayList<Integer> l = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                if(l.isEmpty() || l.get(l.size()-1) != arr1[i]){
                    l.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[i] <arr1[i]){
                if(l.isEmpty() || l.get(l.size()-1) != arr2[j]){
                    l.add(arr2[j]);
                }
                j++;
            }
            else{
                if(l.isEmpty() || l.get(l.size()-1) != arr2[j]){
                    l.add(arr2[j]);
                }
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            if(l.isEmpty() || l.get(l.size()-1) != arr1[i]){
                    l.add(arr1[i]);
                }
                i++;
        }
        while(j<arr2.length){
            if(l.isEmpty() || l.get(l.size()-1) != arr2[j]){
                    l.add(arr2[j]);
                }
                j++;
        }
        int[] res = new int[l.size()];
        int ind = 0;
        for(int k : l){
            res[ind++] = k;
        }
        return res;
    }
}