class Solution {
    public int scoreDifference(int[] nums) {
        int p1=0;
        int p2=0;
        boolean firstActive = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 !=0){
                if(firstActive==true){
                    firstActive = false;
                }else if(firstActive==false){
                    firstActive = true;
                }
            }
            if(i%6==5){
                if(firstActive==true){
                    firstActive = false;
                }else if(firstActive==false){
                    firstActive = true;
                }
            }
            if(firstActive){
                p1= p1+ nums[i];
            } else {
                p2 =p2 +nums[i];
            }
        }
    return p1-p2;
    }
}