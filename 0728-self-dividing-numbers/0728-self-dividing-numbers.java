class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans =new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp=i;
            boolean flag=true;
            while(temp>0){
                int num=temp%10;
                if(num==0 || i %num !=0){
                    flag=false;
                    break;
                }
                temp/=10;
            }
            if(flag){
                ans.add(i);
            }
        }
        return ans;
    }
}