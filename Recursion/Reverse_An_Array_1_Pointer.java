import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] a = {1,2,3,4,5};
		rev(0,a);
		System.out.println(Arrays.toString(a));

	}
	public static void rev(int l, int[] arr){
	    if(l>=arr.length/2){
	        return;
	    }
	    int n = arr.length;
	    int temp = arr[l];
	    arr[l] = arr[n-l-1];
	    arr[n-l-1] = temp;
	    rev(l+1,arr);
	}
}
