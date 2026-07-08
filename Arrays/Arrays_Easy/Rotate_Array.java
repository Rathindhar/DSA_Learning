package Arrays.Arrays_Easy;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 1;
        int[] res = bruteforce(arr,k);
        for(int i:res) System.out.println(i);
        int[] res1 = optimized(arr,k);
        for(int i:res1) System.out.println(i);
        System.out.println(Arrays.toString(bruteforce(arr,k)));
        System.out.println(Arrays.toString(optimized(arr,k)));
    }
    public static int[] bruteforce(int[] arr, int k){
        for(int i=0; i<k; i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        return arr;
    }
    public static int[] optimized(int[] arr, int k){
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[(i+k)%arr.length] = arr[i];
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}
