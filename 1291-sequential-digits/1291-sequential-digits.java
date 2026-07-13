class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans= new ArrayList<>();
        String num ="123456789";
        int lowl=String.valueOf(low).length();
        int highl=String.valueOf(high).length();
        
        for (int len = lowl; len <= highl; len++){
            for(int start=0;start<=num.length()-len;start++){
                int value= Integer.parseInt(num.substring(start, start + len));
    
                if(value<=high && value>=low){
                    ans.add(value);
                }
            }
        }
    return ans;    
    }
}