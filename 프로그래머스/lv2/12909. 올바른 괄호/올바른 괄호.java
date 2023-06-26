import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        char[] cArray = s.toCharArray();
        Stack charStack = new Stack<Character>();
        
        for(char c : cArray){
            if(c == '('){
                charStack.push(c);
            } else {
                if(!charStack.isEmpty())
                    charStack.pop();
                else
                    answer = false;
            }
        }
                    
        if(!charStack.isEmpty())
            answer = false;
        
        System.out.println(answer);

        return answer;
    }
}