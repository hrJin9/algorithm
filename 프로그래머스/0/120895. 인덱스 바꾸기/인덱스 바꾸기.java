class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] st = my_string.toCharArray();;
        
        st[num1] = my_string.charAt(num2);
        st[num2] = my_string.charAt(num1);
        
        return String.valueOf(st);
    }
}