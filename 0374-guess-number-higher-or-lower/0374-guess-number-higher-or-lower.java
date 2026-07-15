/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1;
        int h=n;
        while(l<=h){
            int num= l+ (h-l)/2;
            int check= guess(num);
                if(check==0){
                    return num;
                }
                else if(check==-1){
                    h=num-1;
                }else{
                    l=num+1;
                }
        }
    return -1;
    }
}