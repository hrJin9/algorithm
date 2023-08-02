package algorithm.six;
import java.util.*;

public class 선택정렬2_23882 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        int[] curArr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            curArr[i] = sc.nextInt();
        }

        solution(arr, curArr);


    }

    private static void solution(int[] arr, int[] curArr){
        int minIdx, tmp;
        int count = 0;
        for(int i=1; i<arr.length; i++){
            minIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j; // 기록
                    count++;
                }

            }

            tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;


        }



    }

}
