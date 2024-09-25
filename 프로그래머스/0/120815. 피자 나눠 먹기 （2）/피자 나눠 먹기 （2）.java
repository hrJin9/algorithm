class Solution {
    public int solution(int n) {
        int pizza = 1;
        while (n*pizza % 6 != 0) {
            pizza++;
        }
        
        return n*pizza / 6;
    }
}