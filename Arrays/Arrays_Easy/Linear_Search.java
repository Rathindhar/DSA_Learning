package Arrays.Arrays_Easy;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,7};
        boolean found = false;
        int k = 3;
        for(int i:arr){
            if(i==k){
                found = true;
                break;
            }
        }
        if(found) System.out.println("found");
        else System.out.println("Not found");
    }
}
