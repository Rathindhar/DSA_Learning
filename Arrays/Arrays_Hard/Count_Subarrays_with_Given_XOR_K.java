package Arrays.Arrays_Hard;

public class Count_Subarrays_with_Given_XOR_K {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(bruteforce(arr,k));
        System.out.println(better(arr,k));
        //System.out.println(optimized(arr));

    }
    public static int bruteforce(int[] arr, int K){
        int cnt =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k=i; k<=j; k++){
                    sum^= arr[k];
                }
                if(sum == K) cnt++;
            }
        }
        return cnt;
    }
    public static int better(int[] arr,int K){
        int cnt =0;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){    
                sum^= arr[j];
                if(sum == K) cnt++;
            }
        }
        return cnt;
    }
}
