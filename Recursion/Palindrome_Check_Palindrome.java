import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(rev(0, str));

    }
    public static boolean rev(int l, String s) {
        if (l >= s.length() / 2) {
            return true;
        }
        int n = s.length();
        if (s.charAt(l) != s.charAt(n - l - 1)) return false;
        return rev(l + 1, s);
    }
}