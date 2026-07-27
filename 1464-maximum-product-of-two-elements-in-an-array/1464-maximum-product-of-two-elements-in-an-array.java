class Solution {
    public int maxProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num>first){
                second=first;
                first=num;
            }else if(num>second){
                second=num;
            }
        }
        return (first-1)*(second-1);
    }
}