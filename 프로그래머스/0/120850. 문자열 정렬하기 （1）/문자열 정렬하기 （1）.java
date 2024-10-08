import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                list.add(Character.getNumericValue(c));
            }
        }
        return list.stream()
            .mapToInt(Integer::intValue)
            .sorted()
            .toArray();
    }
}