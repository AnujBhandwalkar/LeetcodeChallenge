class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int counter=0;
        for(int i=0;i<events.length;i++){
            if(events[i].equals("W")){
                counter++;
                if(counter==10){
                    break;
                }
            }else if(events[i].equals("WD") || events[i].equals("NB")){
                score++;
            }
            else{
                char ch= events[i].charAt(0);
                if(ch>='0' && ch<='6'){
                    score+= ch -'0';
                }
            }
        }
        return new int[]{score, counter};
    }
}