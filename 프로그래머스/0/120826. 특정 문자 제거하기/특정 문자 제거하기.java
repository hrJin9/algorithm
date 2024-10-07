class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char l = letter.charAt(0);
        for(char c : my_string.toCharArray()) {
            if (c != l) {
                answer += c;
            }
        }
        
        return answer;
    }
}