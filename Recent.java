/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Recent
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		   int k=sc.nextInt();
		   int c1=0;
		   int c2=0;
		   String[] code=new String[k];
		   for(int j=0;j<k;j++){
		        code[j]=sc.next();
		   }
		   for(String l:code){
		       if(l.equals("START38")) c1++;
		       if(l.equals("LTIME108"))c2++;
		   }
		   System.out.println(c1+" "+c2);
		}
        sc.close();
	}
}
