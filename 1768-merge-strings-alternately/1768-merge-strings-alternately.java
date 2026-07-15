class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n= word1.length();
        int m= word2.length();
        StringBuilder sb=new StringBuilder();
        int min =Math.min(n,m);

        for(int i=0;i<=min;i++){
            if(i<min){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            else{
                if(m>n){
                    sb.append(word2.substring(n,m));
                }else{
                    sb.append(word1.substring(m,n));
                }
            }
        }
    return sb.toString();
    }
}