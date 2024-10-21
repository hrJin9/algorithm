import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        String last = "";
        int[] answer = new int[2];
        List<String> visited = new ArrayList<>();
        visited.add(words[0]);
        
        for(int i=1; i<words.length; i++) {
            last = words[i-1].substring(words[i-1].length()-1);
            if (visited.contains(words[i]) || !words[i].startsWith(last)) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }
            
            visited.add(words[i]);
        }
        
        return answer;
    }
}