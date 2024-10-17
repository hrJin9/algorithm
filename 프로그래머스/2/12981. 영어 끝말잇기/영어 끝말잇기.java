import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        String last = "";
        int[] answer = new int[2];
        Set<String> visited = new HashSet<>();
        visited.add(words[0]);
        
        for(int i=1; i<words.length; i++) {
            // 끝말잇기 여부 검사
            last = words[i-1].substring(words[i-1].length()-1);
            if (!words[i].startsWith(last)) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }
            
            // 중복 여부 검사
            if(visited.contains(words[i])) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }
            
            visited.add(words[i]);
        }
        
        return answer;
    }
}