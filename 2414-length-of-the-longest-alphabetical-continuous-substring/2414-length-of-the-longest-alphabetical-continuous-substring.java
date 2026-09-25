class Solution {
    public int longestContinuousSubstring(String s) {
        int n=s.length();
        int max_count=1;
        int count=1;
        for(int i=0;i<n-1;i++){
            int char_val=s.charAt(i)-'a';
            if(s.charAt(i+1)-s.charAt(i)==1){
                count++;
            }else{
                count=1;
            }
            if(max_count<count){
                max_count=count;
            }
        }
        return max_count;
    }
}