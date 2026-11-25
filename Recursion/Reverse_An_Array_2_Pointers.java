import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] a = {1,2,3,4,5};
		rev(0,a.length-1,a);
		System.out.println(Arrays.toString(a));

	}
	public static void rev(int l, int r, int[] arr){
	    if(l>=r){
	        return;
	    }
	    int temp = arr[l];
	    arr[l] = arr[r];
	    arr[r] = temp;
	    rev(l+1,r-1,arr);
	}
}
