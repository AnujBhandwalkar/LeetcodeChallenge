class Solution {
    public int totalMoney(int n) {
        int daycount = n%7;
        int weekcount =n/7;
        int total=0;
        for (int i = 0; i < weekcount; i++) {
            int start = i + 1;
            for (int j = 0; j < 7; j++) {
                total += start + j;
            }
        }
        int start = weekcount + 1;
        for (int i = 0; i < daycount; i++) {
            total += start + i;
        }
        return total;
    }
}