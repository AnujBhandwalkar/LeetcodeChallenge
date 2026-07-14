class Solution {
    public int sumFourDivisors(int[] nums) {
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int jsum=0;
            for(int j=1; j*j <= nums[i] && count <= 4;j++){
                if(nums[i]%j==0){
                    count++;
                    jsum=jsum+j;  
                    int other = nums[i]/j;
                    if (other != j) {
                        count++;
                        jsum += other;
                    }
                    if (count > 4){
                        break;
                    }
                }
            }
            if(count==4){
                dsum +=jsum;
            }
        }
    return dsum;
    }
}