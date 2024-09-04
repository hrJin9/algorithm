import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String last_words = "";
        ArrayList<String> visited = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
            String cur = words[i];
            // 마지막 단어로 시작하는지 여부
            if (visited.contains(cur) || !cur.startsWith(last_words)) {
                int person = ((i+1) % n == 0) ? n : (i+1) % n;
                answer[0] = person;
                answer[1] = (i/n) + 1;
                break;
            } else {
                visited.add(words[i]);
                last_words = cur.substring(cur.length()-1);
            }
        }

        System.out.println("[" + answer[0] + "," + answer[1] + "]");

        return answer;
    }
}