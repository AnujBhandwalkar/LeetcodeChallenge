class Solution {
    public int maxDigitRange(int[] nums) {
        int maxdigitrange=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            int smalldigit= Integer.MAX_VALUE;
            int largedigit= Integer.MIN_VALUE;
            int num=nums[i];
            while(num>0){
                int x=num%10;
                if(x<smalldigit){
                    smalldigit=x;
                }
                if(x>largedigit){
                    largedigit=x;
                }
                num/=10;
            }
            int digitrange= largedigit-smalldigit;
            if(digitrange> maxdigitrange){
                maxdigitrange=digitrange;
                sum=nums[i];
            }else if (digitrange == maxdigitrange){
                sum += nums[i];
            }   
        }
    return sum;    
    }
}