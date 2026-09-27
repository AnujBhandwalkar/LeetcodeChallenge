class Solution {
    public boolean squareIsWhite(String coordinates) {
        int val=coordinates.charAt(0)-'a';
        int num = coordinates.charAt(1) - '0';
        if(val%2==0 && num%2==0){
            return true;
        }
        if(val%2!=0 && num%2!=0){
            return true;
        }
        return false;
    }
}