class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int a : array) {
            String s = String.valueOf(a);
            for(char c : s.toCharArray()) {
                if(Character.toString(c).equals("7")) {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}