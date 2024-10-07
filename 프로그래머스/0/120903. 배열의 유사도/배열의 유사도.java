class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String x1 : s1) {
            for(String x2 : s2) {
                if (x1.equals(x2)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}