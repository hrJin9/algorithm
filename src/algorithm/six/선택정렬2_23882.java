package algorithm.six;
import java.util.*;

public class 선택정렬2_23882 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        solution(arr, K);

    }

    private static void solution(int[] arr, int K){
        int minIdx, tmp;
        int count = 0;
        String nowArr = "";
        for(int i=arr.length - 1; i>0; i--){
            minIdx = i;
            for(int j=i-1; j>=0; j--){
                if(arr[j] > arr[minIdx]){
                    minIdx = j; // 기록
                }
            }

            if(arr[minIdx] != arr[i]){
                tmp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = tmp;

                // 세기
                count++;
                if(count == K){
                    for(int x : arr){
                        nowArr += x + " ";
                    }
                }
            }
        }

        if(count < K){
            nowArr = "-1";
        }

        System.out.print(nowArr);

    }

}
