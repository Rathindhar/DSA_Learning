package Arrays.Arrays_Medium;

public class Printing_SubArray_With_Max_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        System.out.println(solution(arr));
    }
    public static long solution(int[] arr){
        long maxSum = Long.MIN_VALUE;
        int start=0;
        int ansStart=-1;
        int ansEnd=-1;
        long sum = 0;
        for(int i=0;i<arr.length; i++){
            if(sum == 0) start=i;
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0) sum=0;
        }
        for(int i=ansStart; i<=ansEnd; i++){
            System.out.println(arr[i]);
        }
        return maxSum;
    }
}
