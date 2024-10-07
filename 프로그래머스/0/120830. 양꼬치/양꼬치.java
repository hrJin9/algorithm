class Solution {
    public int solution(int n, int k) {
        int drink = k;
        if (n >= 10) {
            drink -= n / 10;
        }
        
        return 12000 * n + 2000 * drink;
    }
}