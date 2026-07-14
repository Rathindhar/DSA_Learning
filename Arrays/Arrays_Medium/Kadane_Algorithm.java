package Arrays.Arrays_Medium;

public class Kadane_Algorithm {
    public static void main(String[] args) {
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(bruteforce(arr));
        //System.out.println(better(arr));
        //System.out.println(optimized(arr));

    }
    public static int bruteforce(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum= 0;
            for(int j=0; j<arr.length; j++){
                sum+=arr[j];
                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }
}
