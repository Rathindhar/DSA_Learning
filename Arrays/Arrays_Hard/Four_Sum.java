package Arrays.Arrays_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Four_Sum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int k = 0;
        System.out.println(bruteforce(arr,k));
        System.out.println(better(arr,k));
        System.out.println(optimized(arr,k));

    }
    public static List<List<Integer>> bruteforce(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();
        int n= nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    for(int l=k+1; l<n; l++){
                        long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum== target){
                            List<Integer> li = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                            Collections.sort(li);
                            st.add(li);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(st);
    }
    public static List<List<Integer>> better(int[] nums, int target){
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                HashSet<Integer> h = new HashSet<>();
                for(int k=j+1; k<n; k++){
                    
                    long rem = (long)(target-(nums[i]+nums[j]+nums[k]));
                    if(h.contains((int)rem)){
                        List<Integer> li = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],(int)rem));
                        Collections.sort(li);
                        st.add(li);
                    }
                    h.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }
    public static List<List<Integer>> optimized(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = (long) nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target){
                        List<Integer> li = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        res.add(li);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum>target) l--;
                    else k++;
                }
            }
        }
        return res;
    }
}
