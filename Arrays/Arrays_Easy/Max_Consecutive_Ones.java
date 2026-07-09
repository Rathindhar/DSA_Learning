package Arrays.Arrays_Easy;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
       
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        int mc=0;
        int c=0;
        for(int i:arr){
            if(i == 1)c++;
            else{
                c = 0;
            }
            mc = Math.max(c,mc);
        }
        return c;
    }
}
