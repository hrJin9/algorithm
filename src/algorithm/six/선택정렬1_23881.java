package algorithm.six;
import java.util.*;

public class 선택정렬1_23881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 크기
        int K = sc.nextInt(); // 교환횟수
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        solution(arr, K);

    }

    static void solution(int[] arr, int K){
        int indexMin, tmp;
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            indexMin = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[indexMin]){
                    count++;
                    if(count == K){
                        System.out.print(arr[j] + " " + arr[indexMin]);
                    }
                    indexMin = j; // 기록
                }
            }

            tmp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = tmp;

        }
        if(count < K){
            System.out.print(-1);
        }

    }


}
