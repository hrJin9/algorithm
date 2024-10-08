class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int a=i; a<=j; a++) {
            if(String.valueOf(a).contains(String.valueOf(k))) {
                for (String s : String.valueOf(a).split("")) {
                    if (s.equals(String.valueOf(k))) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}