package Arrays.Arrays_Hard;

import java.util.ArrayList;

public class Pascal_Triangle {
    public static void main(String[] args) {
        int k = 4;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0; i<k; i++){
            res.add(generate(i));
        }
        System.out.println(res);
    }
    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> li = new ArrayList<>();
        long ans = 1;
        li.add(1);
        for(int col=1; col<=n; col++){
            ans = ans*(n-col+1);
            ans = ans/col;
            li.add((int)ans);
        }
        return li;

    }
}
