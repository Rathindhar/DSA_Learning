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
		System.out.println(rec(n));

	}
	public static int rec(int n){
	    if(n==0){
	        return 0;
	    }
	    return n+rec(n-1);
	}
}
