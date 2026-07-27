class Solution {
    public int maxProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int secondpos=-1;
        int firstpos=-1;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num>first){
                second=first;
                secondpos = firstpos;
                first=num;
                firstpos=i;
            }else if(num>second){
                second=num;
                secondpos=i;
            }
        }
        return (nums[firstpos]-1)*(nums[secondpos]-1);
    }
}