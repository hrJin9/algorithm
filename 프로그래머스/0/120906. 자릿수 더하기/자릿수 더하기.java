class Solution {
    public int solution(int n) {
        int answer = 0;
        String sn = String.valueOf(n);
        for(char c : sn.toCharArray()) {
            answer += Character.getNumericValue(c);
        }
        
        return answer;
    }
}