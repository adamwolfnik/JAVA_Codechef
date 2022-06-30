public class longestSequence {
    public int lengthOfLongestSubstring(String s) {
        String s1=new String();
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            s1="";
            s1+=String.valueOf(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(!s1.contains(String.valueOf(s.charAt(j)))){
                    s1+=String.valueOf(s.charAt(j));
                }
                else{
                    j=s.length();
                }
            }
            if(s1.length()> max){
                max=s1.length();
            }
        }
        return max;
    }
}
