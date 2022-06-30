import java.util.*;
public class uniquePath {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        long ans=(factorial(m+n-2)/(factorial(m-1)*factorial(n-1)));
        System.out.println(ans);
    }
    public static long factorial(int n){
        long product=1;
        long m=1;
        while(m<=n){
            product=m*product;
            m++;
        }
        return product;
    }
}
