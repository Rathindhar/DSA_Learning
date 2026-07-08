package Arrays.Arrays_Easy;

public class Check_Array_Sorted {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        System.out.println(bruteforce(arr));
        System.out.println(optimized(arr));
        int[] arr1 = {1,2,3,4,5};
        System.out.println(bruteforce(arr1));
        System.out.println(optimized(arr1));
        
    }
    public static boolean bruteforce(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] > arr[j]) return false;
            }
        }
        return true;
    }
    public static boolean optimized(int[] arr){
        for(int i=0;i<arr.length-1; i++){
            if(arr[i] >arr[i+1]) return false;
        }
        return true;
    }
}
