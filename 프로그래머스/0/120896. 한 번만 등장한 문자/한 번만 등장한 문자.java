import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c-'a']++;
        }
        
        for (int i=0; i<26; i++) {
            if(counts[i] == 1) {
                answer += (char) (i + 'a');
            }
        }
        
        return answer;
    }
}