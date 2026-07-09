package Arrays.Arrays_Easy;

public class Find_The_Missing_Number {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimized1(arr));
        System.out.println(optimized2(arr));

    }
    public static int bruteforce(int[] arr){
        int n = arr.length+1;
        for(int i=1; i<=n; i++){
            boolean found = true;
            for(int j=0; j<n-1; j++){
                if(i == arr[j]){
                    found = false;
                    break;
                }
            }
            if(found) return i;
        }
        return -1;
    }
    public static int better(int[] arr){
        int[] hash = new int[arr.length+2];
        for(int i: arr){
            hash[i]++;
        }
        for(int i=1; i<=hash.length; i++){
            if(hash[i] == 0) return i;
        }
        return -1;
    }
    public static int optimized1(int[] arr){
        int n = arr.length+1;
        int s = (n*(n+1))/2;
        int sum = 0;
        for(int i: arr){
            sum+=i;
        }
        return s-sum;
    }
    public static int optimized2(int[] arr){
        int n = arr.length+1;
        int a = 0;
        int b = 0;
        for(int i: arr){
            a^=i;
        }
        for(int i=1;i<=n; i++){
            b^=i;
        }
        return b^a;
    }

}
