import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
        int answer = array[middle];
        return answer;
    }
}