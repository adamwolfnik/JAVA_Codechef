import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length==b.length){
            boolean b1=true;
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    System.out.println("Not anagram");
                    b1=false;
                    break;
                }
                if(b1){
                    System.out.println("Anagram");
                }
            }
        }   
        else{
            System.out.println("Not anagram");
        } 
        sc.close();  
    }
}
