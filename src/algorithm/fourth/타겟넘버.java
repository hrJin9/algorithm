package algorithm.fourth;
import java.util.*;

public class 타겟넘버 {

    public static void main(String[] args){

    }


    public int solution(int[] numbers, int target){
        int answer = 0;

        DFS(numbers[0], numbers[0], target, answer);

        return answer;
    }

    public void DFS(int num, int sum, int target, int answer){
        if(sum == target) {
            answer ++;
            return;
        }

//         더하는 경우
//        DFS(num, sum + 다음거, target, answer);
//
//        // 빼는 경우
//        DFS(num, sum - 다음거, target, answer);
    }


}

