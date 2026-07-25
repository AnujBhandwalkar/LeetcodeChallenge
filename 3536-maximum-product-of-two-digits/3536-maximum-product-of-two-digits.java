class Solution {
    public int maxProduct(int n) {
        int max= Integer.MIN_VALUE;
        int firstlargest=0;
        int secondlargest=0;
        while(n>0){
            int digit=n%10;
            n/=10;
            if(digit>= firstlargest){
                secondlargest= firstlargest;
                firstlargest = digit;
            } else if(digit> secondlargest){
                secondlargest= digit;
            }
        }
        return firstlargest*secondlargest;
    }
}