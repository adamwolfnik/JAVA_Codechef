import java.util.*;
public class FirstandLast {
     public static void main(String[] args){
         int arr[]={1,2,3};
         
         for(int i=0;i<3;i++){
            int arr2[]=new int[3];
            arr2[0]=arr[2];
            for(int j=1;j<3;j++){
                arr2[j]=arr[j-1];
            }
            System.out.println(Arrays.toString(arr2));
         }
     }
}
