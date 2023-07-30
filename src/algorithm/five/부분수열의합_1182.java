package algorithm.five;
import java.util.*;

public class 부분수열의합_1182 {

    static int N;
    static int[] arr;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int sum = sc.nextInt();
        arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        count = 0;
        solution(0, sum, 0);
        if (sum == 0)
            count--;
        System.out.println(count);

    }

    public static void solution(int index, int targetSum, int curSum){
        if (index == N){
            if(curSum == targetSum){
                count++;
            }
            return;
        }

        // 현재 인덱스의 숫자를 선택하는 경우
        solution(index + 1, targetSum, curSum + arr[index]);

        // 현재 인덱스의 숫자를 선택하지 않는 경우
        solution(index + 1, targetSum, curSum);


    }


}
