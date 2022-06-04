/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Compress
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int j=sc.nextInt();
		    int nf=j;
		    int[] frame=new int[j];
		    for(int k=0;k<j;k++){
		        frame[k]=sc.nextInt();
		    }
		    for(int l=0;l<j-1;l++){
		        if(frame[l]==frame[l+1]){
		            nf--;
		        }
		    }
		    System.out.println(nf);
		}
        sc.close();
	}
}