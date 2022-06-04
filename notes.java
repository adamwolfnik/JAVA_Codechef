import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class notes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int amt=sc.nextInt();
		    int notes=amt/100;
		   if(amt%100!=0){
		        amt=amt%100;
		        if(amt>=50){
		            notes++;
		            amt=amt-50;
		        }
		        if(amt>=10){
		            notes+=amt/10;
		            amt=amt%10;
		        }
		        if(amt>=5){
		            notes++;
		            amt-=5;
		        }
		        notes+=amt/2;
		        if(amt%2==1){
		            notes++;
		        }
		    }
		    System.out.println(notes);
		}
	}
}
/*
import java.util.;
import java.lang.;
import java.io.;


class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i = 0;i<T;i++)
        {
            int N = s.nextInt();
            int count =0;
            int arr[] = {100,50,10,5,2,1};
            for(int j =0;j<6;j++)
            {

                count =count+N/arr[j];
                N = N%arr[j];
            }
            System.out.println(count);

        }
    }
}*/