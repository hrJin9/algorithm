package algorithm.three;
import java.util.*;

public class 피보나치 {

    static int[] memo;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n+1];

        if(n >= 1){
            memo[0] = 0;
        }
        if(n >= 2){
            memo[1] = 1;
        }

        System.out.println(fibo(n));
    }

    public static int fibo(int n){

        if(memo[n] != 0) { // 이미 계산된 값이라면 (int[]로 선언해서 계산되지 않은 값은 0으로 초기화되어있음) --> 0번째 피보나치라서 인덱스인 0이랑 똑같음
            return memo[n];
        } else if(n == 0){
            return 0;
        } else {
            return memo[n] = fibo(n-1) + fibo(n-2);
        }


    }

}
