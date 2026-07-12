class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for(int i=0;i<words.length;i++){
            String str=words[i];
            int pos= str.charAt(str.length()-1)-'0';
            ans[pos -1]= str.substring(0, str.length() - 1);
        }
        String sreturn="";
        for(int i=0;i<words.length;i++){
            String f= ans[i];
            sreturn = sreturn + f;
            if (i != ans.length - 1) {
                sreturn += " ";
            }
        }
        return sreturn;
    }
}