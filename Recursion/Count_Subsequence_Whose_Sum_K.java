import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {1,2,1};
		int n = arr.length;
		int sum = 2;
		int cnt = printSubsequence(0,0,sum,arr,n);
		System.out.println(cnt);

	}
	public static int printSubsequence(int ind, int s, int sum, int[] arr, int n){
	    if(ind == n){
	        if(s == sum) return 1;
	        else return 0;
	    }
	    
	    //take
	    s+=arr[ind];
	    int l = printSubsequence(ind+1,s,sum,arr,n);
	    
	    // not take
	    s-=arr[ind];
	    int r = printSubsequence(ind+1,s,sum,arr,n);
	    
	    return l+r;
	    
	}
}
