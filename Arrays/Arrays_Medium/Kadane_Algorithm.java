package Arrays.Arrays_Medium;

public class Kadane_Algorithm {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimized(arr));

    }
    /*Thought Process

"I want to check every possible subarray. For every subarray, 
I'll calculate its sum and keep track of the maximum sum."

There are 3 steps:

Choose the starting index.
Choose the ending index.
Calculate the sum of that subarray.

That's why we need 3 loops. */
    public static int bruteforce(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i;k<=j; k++){
                    sum +=arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    /*Thought Process

"While extending the subarray, I don't need to calculate the sum again. 
I can simply keep adding the next element." */
    public static int better(int[] arr){
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
    /*
    I maintain a running sum while traversing the array. At each element, 
    I add it to the current sum and update the maximum sum if needed. 
    If the running sum becomes negative, 
    I reset it to zero because a negative prefix would only decrease the 
    sum of any future subarray. 
    This gives an O(n) solution with O(1) extra space. */
    public static int optimized(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:arr){
            sum+=i;
            if(sum>maxSum) maxSum=sum;
            if(sum<0) sum=0;
        }
        return maxSum;
    }
}
