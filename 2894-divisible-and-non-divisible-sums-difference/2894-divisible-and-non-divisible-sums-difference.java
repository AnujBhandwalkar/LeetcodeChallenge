class Solution {
    public int differenceOfSums(int n, int m) {
        int number=n;
        int num1=0;
        int num2=0;
       while(number>0){
        if(number%m!=0){
            num1+=number;
        }
        else{
            num2=num2 +number;
        }
        number=number-1;
       } 
       return num1-num2;
    }
}