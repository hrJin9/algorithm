import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int min = numbers[0] * numbers[1];
        int max = numbers[numbers.length -2] * numbers[numbers.length-1];
        return Math.max(min, max);
    }
}