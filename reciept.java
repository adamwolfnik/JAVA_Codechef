/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class reciept
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
		    int price =sc.nextInt();
		    int[] amt={1,2,4,8,16,32,64,128,256,512,1024,2048};
		    int count=0;
		    while(price>0){
		        if(price>=2048){
		            price-=2048;
		            count+=1;
		        }
		        for(int j=0;j<12;j++){
		            if(amt[j]==price){
		                price=price-amt[j];
		                count+=1;
		                break;
		            }
                    if(amt[j]>price){
                        price=price-amt[j-1];
                    }
		        }
		    }
            System.out.println(count);
		}
	}
}
