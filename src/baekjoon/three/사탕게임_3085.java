package baekjoon.three;
import java.util.*;

public class 사탕게임_3085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] arr = new String[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.next();
            }
        }

        System.out.println(solution(arr));

    }

    static int count = 1;

    public static int solution(String[][] arr){


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(!arr[i][j].equals(arr[i][j+1])){ // 같은 행의 다음 열이 다르면 바꿀 수 있음
                    if(arr[i][j+1])
                }

            }
        }




        return answer;
    }


}
