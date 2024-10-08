import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();
        for(int i=0; i<my_string.length(); i++) {
            if(Character.isUpperCase(array[i])) {
                array[i] = Character.toLowerCase(array[i]);
            } 
        }
        Arrays.sort(array);
        for (char c : array) {
            answer += c;
        }
        return answer;
    }
}