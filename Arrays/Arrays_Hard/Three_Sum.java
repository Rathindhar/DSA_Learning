package Arrays.Arrays_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimized(arr));

    }
    public static List<List<Integer>> bruteforce(int[] arr){
        HashSet<List<Integer>> st = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            
            for(int j=i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k]));
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
    public static List<List<Integer>> better(int[] arr){
        HashSet<List<Integer>> st = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            HashSet<Integer> h = new HashSet<>();
            for(int j=i+1; j<arr.length; j++){
                int rem = -(arr[i]+arr[j]);
                if(h.contains(rem)){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],rem));
                    Collections.sort(temp);
                    st.add(temp);
                }
                h.add(arr[j]);
            }
        }
        return new ArrayList<>(st);

    }
    public static List<List<Integer>> optimized(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(arr);
        int n= arr.length;
		for(int i=0; i<n; i++){
			if(i>0 && arr[i]== arr[i-1]) continue;
			int j=i+1;
			int k = n-1;
			while(j<k){
				int sum = arr[i]+arr[j]+arr[k];
				if(sum ==0){
					ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k]));
					res.add(temp);
					j++;
					k--;
					while(j<k && arr[j] == arr[j-1]) j++;
					while(j<k && arr[k] == arr[k+1]) k--;
				}
				else if(sum > 0){
					k--;
				}
				else j++;
			}
		}
		return res;
    }
}
