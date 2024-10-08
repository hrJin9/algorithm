class Solution {
    public String solution(String my_string) {
        String answer = "";
        String visited = "";
        char[] str = my_string.toCharArray();
        for(int i=0; i<str.length; i++) {
            if(!visited.contains(String.valueOf(str[i]))) {
                visited += str[i];
                answer += str[i];
            } 
        }
        
        return answer;
    }
}