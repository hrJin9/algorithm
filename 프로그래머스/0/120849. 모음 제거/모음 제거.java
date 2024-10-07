class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] 모음 = new char[]{'a','e','i','o','u'};
        for (char c : my_string.toCharArray()) {
            boolean flag = true;
            for (char s : 모음) {
                if (c == s) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer += c;
            }
        }
        return answer;
    }
}