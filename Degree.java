import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int n1=sc.nextInt();
		    int d[]=new int[n1];
		    int d1=n1-1;
		    for(int j=0;j<n1;j++){
		        d[j]=sc.nextInt();
		    }
		    for(int k=n1-1;k>=0;k--){
		        if(d[k]!=0){
		            break;
		        }
		        else{
		            d1--;
		        }
		    }
		    System.out.println(d1);
		}
        sc.close();
	}
}
