import java.util.*;
public class arrange {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]  input= new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        Arrays.sort(input);
        for(int j:input){
            System.out.print(j);
        }
    }
}
