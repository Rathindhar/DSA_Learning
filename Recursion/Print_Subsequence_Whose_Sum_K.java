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
		printSubsequenceSumK(0,arr,n,li,sum,0);

	}
	public static void printSubsequenceSumK(int ind,int[] arr,int n,List<Integer> li, int sum, int s){
	    if(ind==n){
	        if(s == sum)
	        System.out.println(li);
	        return;
	    }
	    //take
	    s+=arr[ind];
	    li.add(arr[ind]);
	    printSubsequenceSumK(ind+1,arr,n,li,sum,s);
	    //not take
	    s-=arr[ind];
	    li.remove(li.size()-1);
	    printSubsequenceSumK(ind+1,arr,n,li,sum,s);
	}
}
