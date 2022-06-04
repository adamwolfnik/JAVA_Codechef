/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class gcdLcm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int gcd=GCD(a,b);
		    int lcm=LCM(a,b);
		    System.out.println(gcd+" "+lcm);
		}
	}
	public static int LCM(int a,int b){
	    int o=a*b;
    for(int i=1;i<=a*b;i++){
        if(i%a==0 && i%b==0){
            o=i;
            break;
            
        }
    }
    return o;
    }
    
    public static int GCD(int a,int b){
    int c=Math.max(a,b);
    int o1=c;
    for(int i=c;i>=2;i--){
        if(a%i==0 && b%i==0){
            o1=i;
            break;
        }
    }
    return o1;
    }
}
/*
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    long a,b;
		     a=sc.nextInt();
		     b=sc.nextInt();
		   long gcd=GCD(a,b);
		    long lcm=((long)a*b)/gcd;
		    System.out.println(gcd+" "+lcm);
		}
	}
	
    static long GCD(long a, long b){
        if(a==b)
        return a;
        if(a==0)
        return b;
        if(b==0)
        return a;
        return GCD(b,a%b);
    }
    
}*/
