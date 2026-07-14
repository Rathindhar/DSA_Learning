package Arrays.Arrays_Medium;

import java.util.Arrays;

public class Sort_An_Array_of_0s_1s_2s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 0};
        System.out.println(Arrays.toString(bruteforce(arr)));
        System.out.println(Arrays.toString(better(arr)));
        System.out.println(Arrays.toString(optimal(arr)));

    }
    public static int[] bruteforce(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public static int[] better(int[] arr){
        int zc =0;
        int oc =0;
        int tc =0;
        for(int i:arr){
            if(i==0)zc++;
            else if(i==1) oc++;
            else tc++;
        }
        int index=0;
        while(zc-- >0)arr[index++] = 0;
        while(oc-- >0)arr[index++] = 1;
        while(tc-- >0)arr[index++] = 2;
        return arr;
    }
    public static int[] optimal(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
}
