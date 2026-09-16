class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Arrays.sort(candyType);
        int count=1;
        for(int i=0;i<n-1;i++){
            if(candyType[i]!=candyType[i+1]){
                count++;
            }   
        }
        return Math.min(count,n/2);
    }
}