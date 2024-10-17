import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skill_array = skill.toCharArray();
        
        for(String s : skill_trees) {
            String result = "";
            
            for(char c : s.toCharArray()) {
                if(skill.contains(Character.toString(c))) {
                    result += c;
                }
            }
            
            char[] result_array = result.toCharArray();
            boolean flag = true;
            for(int i=0; i<result.length(); i++) {
                if(skill_array[i] != result_array[i]) {
                    flag = false;
                    break;
                }
            }
            
            if(flag) {
                answer++;
            }
            
        }
        
        return answer;
    }
}