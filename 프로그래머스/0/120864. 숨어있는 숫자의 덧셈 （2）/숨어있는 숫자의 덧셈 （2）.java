class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String last = "";
        for(char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                last += c;
            } else {
                if (last.length() > 0) {
                    answer += Integer.parseInt(last);
                }
                last = "";
            }
        }
        
        if (last.length() != 0) {
            answer += Integer.parseInt(last);
        }
        
        return answer;
    }
}