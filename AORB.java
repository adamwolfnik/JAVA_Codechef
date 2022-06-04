/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AORB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=x*2+(x+y)*4;
		    int b=y*4+(x+y)*2;
		    int c=Math.min(a,b);
		    System.out.println(1500-c);
		}
        sc.close();
	}
}