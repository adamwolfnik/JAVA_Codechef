import java.util.*;
public class casino {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int c1=0,c2=0,c3=0;
        int t1=25-m1;
        int t2=120-m2;
        int t3=12-m3;
        int n1=0,n2=0,n3=0;
        while(r>0){
            c1++;
            if(c1==t1 && n1==0){
                r+=20;
                r--;
                n1=t1+25;
            }
            else if(c1==n1){
                n1+=25;
                r+=20;
                r--;
            }
            else{
                r--;
            }
            if(r==0){
                break;
            }
            c2++;
            if(c2==t2 && n2==0){
                r+=80;
                r--;
                n2=t2+120;
            }
            else if(c2==n2){
                n2+=120;
                r+=80;
                r--;
            }
            else{
                r--;
            }
            if(r==0){
                break;
            }
            c3++;
            if(c3==t3 && n3==0){
                r+=8;
                r--;
                n3=t3+48;
            }
            else if(c3==n3){
                n3+=25;
                r+=12;
                r--;
            }
            else{
                r--;
            }
            if(r==0){
                break;
            }

        }
        System.out.println(c1+c2+c3);
    }
}
