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
        int indexmin, tmp;
        int count = 0;
        for (int i=arr.length-1; i>0; i--) {
            indexmin = i;
            for (int j=i-1; j>=0; j--){
                if(arr[j] > arr[indexmin]){
                    indexmin = j; // 기록
                }
            }

            if(arr[indexmin] != arr[i]){
                // 수세기
                count++;
                if(count == K)
                    System.out.print(arr[i] + " " + arr[indexmin]);
                // 바꾸기
                tmp = arr[indexmin];
                arr[indexmin] = arr[i];
                arr[i] = tmp;
            }
        }
        if(count < K){
            System.out.println(-1);
        }

    }


}
