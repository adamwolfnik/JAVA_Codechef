/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class matches
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] matches={6,2,5,5,4,5,6,3,7,6};
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=a+b;
		    int sticks=0;
		    while(c>=10){
		        sticks+=matches[c%10];
		        c=c/10;
		    }
		    System.out.println(sticks+matches[c]);
		}
	}
}

