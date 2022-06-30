import java.util.*;
public class Shift {
    public static void main(String[] args){
        int nums[]={-2,-3,-3,7,-3,0,5,0,-8,-4,-1,2};
        Set <Integer> set=new HashSet<Integer>();
        for(int i:nums){
            set.add(i);
        }
        System.out.println(set);
        
    }
}
