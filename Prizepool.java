/* package codechef; // don't place package name! */

import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Prizepool
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int amt=x*10+y*90;
		    System.out.println(amt);
		}
        sc.close();
	}
}