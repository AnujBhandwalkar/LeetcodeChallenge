class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            if(str.charAt(0)=='X'){
                if(str.charAt(1)=='+'){
                    sum++;
                }else{
                    sum--;
                }
            }
            if(str.charAt(0)=='+'){
                sum++;
            }if(str.charAt(0)=='-'){
                sum--;
            }
        }
        return sum;
    }
}