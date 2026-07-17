package Arrays.Arrays_Medium;

import java.util.Arrays;

public class Next_Permutation {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        //System.out.println(Arrays.toString(bruteforce(arr)));
        optimized(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void optimized(int[] nums){
        int index = -1;
        int n=nums.length;
        //1. Find the Breakpoint
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        // if there is no break point just reverse and return 
        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }

        //2. Find next greater element after the breakpoint
        for(int i=n-1; i>index; i--){
            if(nums[i] > nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        //3. Reverse the remaining element
        reverse(nums,index+1,n-1);
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    
}
