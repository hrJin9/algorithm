class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            int fact = 1;
            for (int j=1; j<=i; j++) {
                fact *= j;
            }
            
            if (fact > n) {
                break;
            } else {
                answer = i;
            }
        }
        
        
        return answer;
    }
}