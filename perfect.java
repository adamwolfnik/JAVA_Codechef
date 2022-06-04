/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class perfect
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		for(int i=0;i<4;i++){
		    a[i]=sc.nextInt();
		}
        sc.close();
		int c=0;
		for(int i:a){
		    if(i>=10){
		        c++;
		    }
		}
		System.out.print(c);
	}
}