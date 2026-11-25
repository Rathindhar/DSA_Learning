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
		List<Integer> li = new ArrayList<>();
		printSubsequenceSumK(0,li,0,sum,arr,n);

	}
	public static boolean printSubsequenceSumK(int ind, List<Integer> ds, int s, int sum,int[] arr, int n){
	    if(ind == n){
	        if(s == sum){
	            System.out.println(ds);
	            return true;
	        }
	        else return false;
	    }
	    // take
	    s+=arr[ind];
	    ds.add(arr[ind]);
	    if(printSubsequenceSumK(ind+1,ds,s,sum,arr,n) == true) return true;
	    
	    // not take
	    s-=arr[ind];
	    ds.remove(ds.size()-1);
	    if(printSubsequenceSumK(ind+1,ds,s,sum,arr,n) == true) return true;
	    
	    return false;
	}
}
