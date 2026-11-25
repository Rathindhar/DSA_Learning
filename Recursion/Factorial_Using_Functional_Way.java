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
		System.out.println(fact(n));

	}
	public static int fact(int n){
	    if(n==1){
	        return 1;
	    }
	    return n*fact(n-1);
	}
}
