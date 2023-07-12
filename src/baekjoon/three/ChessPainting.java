package baekjoon.three;
import java.util.*;

public class ChessPainting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String[][] arr = new String[N][M];
        for(int i=0; i<N; i++){
            sc.nextLine();
            for(int j=0; j<M; j++){
                arr[i][j] = sc.next();
            }
        }

        System.out.println(solution(arr, N, M));
    }

    static int count = 0;

    public static int solution(String[][] arr, int N, int M){

        for(int i=0; i<=N - 8; i++){
            for(int j=0; j<=M - 8; j++){
                if(arr[i][j].equals(arr[i][j+1])) count++; // 행 비교
                if(arr[i][j].equals(arr[i+1][j])) count++; // 열 비교
            }
        }

        return count;
    }

}
