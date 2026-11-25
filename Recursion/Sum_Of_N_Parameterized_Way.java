import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		rec(n,0);

	}
	public static void rec(int i, int sum){
	    if(i<1){
	        System.out.println(sum);
	        return;
	    }
	    rec(i-1,sum+i);
	}
}
