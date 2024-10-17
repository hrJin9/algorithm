class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] array = s.split(" ");
        
        for(int i=0; i<array.length; i++){
            try {
                int a = Integer.parseInt(array[i]);
                answer += a;
            } catch (Exception e) {
                answer -= Integer.parseInt(array[i-1]);
            }
            
        }
        
        return answer;
    }
}