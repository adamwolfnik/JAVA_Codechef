import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class binary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s=new String();
        int max=0;
        while(n>0){
            s+=n%2;
            n=n/2;
        }
        int count=0;
        // String[] ones=s.split("0");
        // for(String i: ones){
        //     if(max<i.length())
        //     max=i.length();
        // }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count=0;
            }
            else{
                count++;
            }
            if(max<count){
                max=count;
            }
        }
        System.out.println(max);
        bufferedReader.close();
    }
}
