class Solution {
    public int splitNum(int num) {
        int arr[]= new int[10];
        int n1=0;
        int n2=0;
        boolean flag=true;
        while(num>0){
            int a=num%10;
            arr[a]++;
            num/=10;
        }
        for(int i=0;i<10;i++){
            while(arr[i]>0){
                if(flag){
                    n1=n1*10 + i;
                    flag=false;
                    arr[i]--;
                }
                else{
                    n2=n2*10 + i;
                    flag=true;
                    arr[i]--;
                }
            }
        }
        return n1+n2;
    }
}