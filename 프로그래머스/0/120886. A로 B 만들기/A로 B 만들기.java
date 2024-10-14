class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] aArray = new char[26];
        for(char c : after.toCharArray()) {
            aArray[c-'a'] += 1;
        }
        
        char[] bArray = new char[26];
        for(char c : before.toCharArray()) {
            bArray[c-'a'] += 1;
        }
        
        for(int i=0; i<aArray.length; i++) {
            if(aArray[i] != bArray[i]) {
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}