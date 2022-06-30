import java.util.*;
class Sequence {
    public int longestConsecutive(int[] nums) {
                Arrays.sort(nums);
                int max=0;
                double a=nums.length;
                 int size=(int)Math.round(a/2);
                if(nums.length==0){
                    max=0;
                }
                else{
                    for(int i=0;i<nums.length;i++){
                        int find=nums[i];
                        int count=0;
                        for(int j=i;j<nums.length;j++){
                            if(nums[j]==find){
                                find++;
                                count++;
                            }
                        }
                        if(count>max){
                            max=count;
                        }
                        if(count>size){
                            break;
                        }
                       
                    }
                }
        return max;
    }
}