class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int lenghtr1=Math.abs(ax2-ax1);
        int breadthr1=Math.abs(ay2-ay1);
        int lenghtr2=Math.abs(bx2-bx1);
        int breadthr2=Math.abs(by2-by1);
        int area1=lenghtr1*breadthr1;
        int area2=lenghtr2*breadthr2;

        int leftedge=Math.max(ax1,bx1);
        int rightedge=Math.min(ax2,bx2);
        int topedge=Math.min(ay2,by2);
        int bottomedge=Math.max(ay1,by1);

        int overlapwidth=rightedge-leftedge;
        int overlapheight=topedge-bottomedge;
        int overlaparea =overlapwidth*overlapheight;
        int ans;
        if(overlapwidth<=0 ||overlapheight<=0){
            ans= area1 +area2;
        }else{
            ans= area1 +area2 - overlaparea;
        }
    return ans;
    }
}