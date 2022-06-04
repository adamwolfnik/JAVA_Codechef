import java.util.*;
import java.lang.*;
import java.io.*;

class LeadGame
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); 
            int[] arr  = new int[N];
            int[] arr2 = new int[N];
            int sum1 = 0;
            int sum2 = 0;
            int count1 = 0;
            int count2 = 0;
            int[] lead1 = new int[N];
            int[] lead2 = new int[N];
            for(int j =0;j<N;j++)
            {
                arr[j] = s.nextInt();
                arr2[j] = s.nextInt();
                sum1 = sum1 + arr[j];
                sum2 =sum2 + arr2[j];
                if(sum1>sum2)
                {
                    lead1[count1] = sum1-sum2;
                    count1++;
                }
                if(sum2>sum1)
                {
                    lead2[count2] = sum2-sum1;
                    count2++;
                }
            }
            Arrays.sort(lead1);
            Arrays.sort(lead2);
            if(lead1[N-1]>lead2[N-1]){
                System.out.println(1+" "+lead1[N-1]);
            }
            else{
                System.out.println(2+" "+lead2[N-1]);
            }
    }
}
