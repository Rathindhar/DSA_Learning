package Arrays.Arrays_Easy;

import java.util.Arrays;

class Largest_Element{
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        System.out.println(bruteforce(arr));
        System.out.println(optimized(arr));

    }
    public static int bruteforce(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int optimized(int[] arr){
        int largestElement = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > largestElement) largestElement = i;
        }
        return largestElement;
    }
}