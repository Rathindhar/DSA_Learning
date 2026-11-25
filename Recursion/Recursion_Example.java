import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int cnt = 0;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		rec();

	}
	public static void rec(){
	    if(cnt == 3) return;
	    System.out.println(cnt);
	    cnt++;
	    rec();
	}
}
