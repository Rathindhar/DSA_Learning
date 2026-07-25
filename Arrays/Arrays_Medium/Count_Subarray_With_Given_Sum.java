package Arrays.Arrays_Medium;

public class Count_Subarray_With_Given_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(bruteforce(arr,k));
        //System.out.println(better(arr));
        //System.out.println(optimized(arr));

    }
    public static int bruteforce(int[] arr, int k){
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum == k) cnt++;
                else if(sum > k) break;
            }
        }
        return cnt;
    }
}
