class Solution {
    public int solution(int order) {
        int answer = 0;
        for(char c : String.valueOf(order).toCharArray()) {
            int v = Character.getNumericValue(c);
            if(v == 3 || v == 6 || v == 9) {
                answer++;
            }
        }
        
        
        return answer;
    }
}