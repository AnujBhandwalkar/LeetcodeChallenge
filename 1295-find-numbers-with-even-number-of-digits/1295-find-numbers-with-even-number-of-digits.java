class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int num: nums){
            int counter =0;
            while(num>0){
                int digit=num%10;
                num/=10;
                counter++;
            }
            if(counter%2==0){
                ans++;
            }
        }
        return ans;
    }
}