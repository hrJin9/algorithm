class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        char[] array = String.valueOf(num).toCharArray();
        for (int i=0; i<array.length; i++) {
            int n = Character.getNumericValue(array[i]);
            if(n == k) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}