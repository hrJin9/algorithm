package algorithm.six;
import java.util.*;
import java.util.stream.Collectors;

public class 삽입정렬1_24051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열의 크기
        int K = sc.nextInt(); // 저장 횟수

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        insertSort(arr, K);
    }

    private static void insertSort(int[] arr, int K){

        int count = 0;
        for(int idx=1; idx<arr.length; idx++) {
            int tmp = arr[idx];
            int prevIdx = idx - 1;

            while ((prevIdx >= 0) && (arr[prevIdx] > tmp)) { // 전의 숫자가 더 크면 자리를 바꿔준다
                arr[prevIdx + 1] = arr[prevIdx];
                count++;
                if(count == K){
                    System.out.print(arr[prevIdx + 1]);
                }
                prevIdx--;
            }

            if(prevIdx + 1 != idx){
                arr[prevIdx + 1] = tmp;
                count++;
                if(count == K){
                    System.out.print(arr[prevIdx + 1]);
                }
            }
        }

        if(count < K){
            System.out.print(-1);
        }

    }

}
