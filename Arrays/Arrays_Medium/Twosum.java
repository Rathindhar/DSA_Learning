package Arrays.Arrays_Medium;

import java.util.Arrays;
import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        System.out.println(Arrays.toString(bruteforce(arr , target)));
        System.out.println(Arrays.toString(better(arr, target)));
        System.out.println(Arrays.toString(optimal(arr, target)));

    }
    public static int[] bruteforce(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] better(int[] arr, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complement = target-arr[i];
            if(hm.containsKey(complement)) return new int[] {i,hm.get(complement)};
            hm.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    public static int[] optimal(int[] arr, int target){
        int[][] arr2 = new int[arr.length][2];
        for(int i=0; i<arr.length; i++){
            arr2[i][0] = arr[i];
            arr2[i][1] = i;
        }
        Arrays.sort(arr2,(a,b)->Integer.compare(a[0], b[0]));
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr2[left][0]+arr2[right][0];
            if(sum < target) left++;
            else if(sum > target) right--;
            else return new int[]{arr2[left][1],arr2[right][1]};
        }
        return new int[]{-1,-1};
    }
}
