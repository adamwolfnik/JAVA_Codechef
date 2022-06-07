import java.util.Arrays;

public class LeetQ1 {
    public static void main(String[] args){
        long sum=0;
        int digits[]={8,8,2,5,2,9,9,3,3,8,5,7,0,6,9};
        int len = digits.length;
        int count=0;
    for (int i = len - 1; i >= 0; i--) {
        count++;
        if (digits[i] == 9) {
            digits[i] = 0;
        }   
        else {
            digits[i] = digits[i] + 1;
            System.out.print(Arrays.toString(digits));
            break;
        }
        
        if (i == 0 && digits[i] == 0) {
            int[] y = new int[len + 1];
            y[0] = 1;
            for (int j = 1; j <= len; j++) {
                y[j] = digits[j - 1];
            }
            digits = y;
        }   
    }
    System.out.println(count);
    System.out.println(Arrays.toString(digits));
    }
    //     int l=arr.length;
    //     System.out.println(l);
    //     if(l>15){
    //     int arr2[]=new int[l];
    //     arr2[l-1]=arr[l-1]+1;
    //     for(int i=l-1;i>=0;i--){
    //         if(arr2[i]==10){
    //             arr2[i]=0;
    //             arr2[i-1]=arr[i-1]+1;
    //         }
    //         else{
    //             arr2[i]=arr[i];
    //         }
    //     }
    //     arr2[l-1]=arr[l-1]+1;
    //     System.out.println(Arrays.toString(arr2));
    //     }
    //     else{
    //         int a=arr.length-1;
    //         for(int i=0;i<arr.length;i++){
    //             sum+=arr[i]*(Math.pow(10,a-i));
    //          }
    //         sum=sum+1;
    //         int n=String.valueOf(sum).length();
    //         int[] arr2=new int[n];
    //         int l1=arr2.length-1;
    //         for(int i=0;i<arr2.length;i++){
    //             arr2[i]=(int)(sum/Math.pow(10,l1-i ));
    //             sum=(int)(sum%(Math.pow(10,l1-i )));
    //         }
    //     System.out.println(Arrays.toString(arr2));
    // }
}

