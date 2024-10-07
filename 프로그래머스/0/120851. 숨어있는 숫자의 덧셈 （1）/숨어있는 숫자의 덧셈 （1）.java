class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()){
            try {
                answer += Integer.parseInt(Character.toString(c));
            } catch (Exception e) {
                continue;
            }
        }
        
        return answer;
    }
}