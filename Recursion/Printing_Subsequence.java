import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {3,1,2};
		int n = arr.length;
		List<Integer> li = new ArrayList<>();
		printSubsequence(0,arr,n,li);

	}
	public static void printSubsequence(int ind,int[] arr,int n,List<Integer> li){
	    if(ind==n){
	        System.out.println(li);
	        return;
	    }
	    //take
	    li.add(arr[ind]);
	    printSubsequence(ind+1,arr,n,li);
	    //not take
	    li.remove(li.size()-1);
	    printSubsequence(ind+1,arr,n,li);
	}
}
