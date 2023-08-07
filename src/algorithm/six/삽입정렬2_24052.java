package algorithm.six;
import java.util.*;

public class 삽입정렬2_24052 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열의 크기
        int K = sc.nextInt(); // 변경 횟수

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        insertSort2(arr, K);

    }

    private static void insertSort2(int[] arr, int K){
        int count = 0;

        String printArr = "";
        for(int idx=1; idx<arr.length; idx++){
            int temp = arr[idx];
            int prevIdx = idx - 1;

            while((prevIdx >= 0) && (arr[prevIdx] > temp)){
                arr[prevIdx + 1] = arr[prevIdx];
                count++;
                if(count == K){
                    for(int a : arr){
                        printArr += a + " ";
                    }
                }
                prevIdx --;
            }

            if(prevIdx + 1 != idx){
                arr[prevIdx + 1] = temp;
                count++;
                if(count == K){
                    for(int a : arr){
                        printArr += a + " ";
                    }
                }
            }
        }

        if(count < K)
            printArr = "-1";

        System.out.println(printArr);

    }


}
