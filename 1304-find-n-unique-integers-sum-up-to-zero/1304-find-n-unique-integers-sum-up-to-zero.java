class Solution {
    public int[] sumZero(int n) {
        int var1=1;
        int var2=-1;
        int arr[]=new int[n];
        if(n%2!=0){
            arr[0]=0;
            for(int i=1;i<arr.length;i++){
                if(i%2!=0){
                    arr[i]=var1;
                    var1++;
                }else{
                    arr[i]=var2;
                    var2--;
                }
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(i%2!=0){
                    arr[i]=var1;
                    var1++;
                }else{
                    arr[i]=var2;
                    var2--;
                }
            }
        }
    return arr;
    }
}