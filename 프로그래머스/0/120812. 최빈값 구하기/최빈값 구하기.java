import java.util.*;
class Solution {
    public static int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int max = 0;
        int answer = 0;
        for (int key : array) {
            int count = map.getOrDefault(key, 0) + 1;
            
            if(count > max) {
                max = count;
                answer = key;
            } else if (count == max) {
                answer = -1;
            }
            
            map.put(key, count);
        }
        
        return answer;
    }
}