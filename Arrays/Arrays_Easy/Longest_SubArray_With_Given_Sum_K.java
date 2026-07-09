package Arrays.Arrays_Easy;

public class Longest_SubArray_With_Given_Sum_K {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int k=15;
        System.out.println(bruteforce(arr,k));
        System.out.println(better(arr));
        System.out.println(optimized(arr));

    }
    public static int bruteforce(int[] arr, int k){
        int maxCount = 0;
        for(int i=0; i<arr.length; i++){
            int sum =arr[i];
            int cnt =1;
            for(int j=i+1; j<arr.length; j++){
                sum +=arr[j];
                cnt++;
                if(sum == k){
                    maxCount = Math.max(cnt,maxCount);

                }
            }
        }
    }
}
