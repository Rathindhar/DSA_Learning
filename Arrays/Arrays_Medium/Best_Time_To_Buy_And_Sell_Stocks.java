package Arrays.Arrays_Medium;

public class Best_Time_To_Buy_And_Sell_Stocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(bruteforce(arr));
        System.out.println(optimized(arr));
    }
    public static int bruteforce(int[] arr){
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++){
            int profit = 0;
            for(int j=i+1; j<arr.length; j++){
                profit = arr[j]- arr[i];
                maxProfit=Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static int optimized(int[] arr){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i: arr){
            if(i<minPrice) minPrice=i;
            else maxProfit=Math.max(maxProfit, i-minPrice);
        }
        return maxProfit;
    }
}
