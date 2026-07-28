package Arrays.Arrays_Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimized(arr));

    }
    public static List<Integer> bruteforce(int[] arr){
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            for(int j=i; j<arr.length; j++){
                if(arr[i] == arr[j])cnt++;
            }
            if(cnt > arr.length/3) res.add(arr[i]);
            if(res.size() == 2) break;
        }
        return res;
    }
    public static List<Integer> better(int[] nums){
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int mm = nums.length/3 +1;
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i, 0)+1);
            if(hm.get(i) == mm) res.add(i);
        }
        
        return res;
    }
    public static List<Integer> optimized(int[] nums){
        List<Integer> res = new ArrayList<>();
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(cnt1==0 && el2 != nums[i]){
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2==0 && el1 != nums[i]){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1) cnt1++;
            else if(nums[i] == el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i:nums){
            if(i == el1) cnt1++;
            else if(i == el2) cnt2++;
        }
        int mini = n/3 +1;
        if(cnt1 >= mini) res.add(el1);
        if(cnt2 >= mini && el1 != el2) res.add(el2);
        
        return res;
    }
}
