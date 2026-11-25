package Arrays_Pattern_Based.Prefix_Sum;


public class Range_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,4,0};
        int ps[] = new int[arr.length];
        ps[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            ps[i] = arr[i]+ ps[i-1];
        }
        int L = 1;
        int R = 3;
        int sum = (L == 0) ? ps[R] : ps[R] - ps[L - 1];
        System.out.println(sum);
        
    }
}