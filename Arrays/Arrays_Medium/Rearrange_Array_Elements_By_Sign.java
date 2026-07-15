package Arrays.Arrays_Medium;

import java.util.Arrays;

public class Rearrange_Array_Elements_By_Sign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(bruteforce(arr)));
        System.out.println(Arrays.toString(optimized(arr)));
    }
    public static int[] bruteforce(int[] arr){
        int[] p = new int[arr.length/2];
        int[] n = new int[arr.length/2];
        int pi=0;
        int ni=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0) p[pi++]=arr[i];
            else n[ni++]=arr[i];
        }
        pi=0;
        ni=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0) arr[i] = p[pi++];
            else arr[i] = n[ni++];
        }
        return arr;
    }
    public static int[] optimized(int[] arr){
        int res[] = new int[arr.length];
        int pi=0;
        int ni=1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                res[pi] = arr[i];
                pi+=2;
            }
            else{
                res[ni] = arr[i];
                ni+=2;
            }
        }
        return res;
    }
}
