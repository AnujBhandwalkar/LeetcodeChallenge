class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                int ch=words[i].charAt(j);
                int val= ch -'a';
                sum= sum+ weights[val];
            }
            int resultnum=sum%26;
            char letter = (char) ('z' - resultnum);
            sb.append(letter);
        }
        return sb.toString();
    }
}