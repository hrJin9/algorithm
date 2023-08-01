package algorithm.six;
import java.util.*;

public class 거품정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // 거품정렬
        bubbleSort(arr);

        // 선택정렬
        selectionSort(arr);

        // 삽입정렬
//        insertionSort(arr);

        // 확인
        for(int x : arr) System.out.print(x + " ");
    }

    private static void bubbleSort(int[] arr){

        int temp;

        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length - i; j++){
                if(arr[j-1] > arr[j]){ // j-1이 더 크면
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }


    private static void selectionSort(int[] arr){
        int minIdx, temp;

        for(int i=0; i<arr.length - 1; i++){ // 앞에서 정렬이 다 되어서 맨 뒤의 숫자는 이미 정렬이 끝났다.
            minIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIdx]){ // j번째의 수가 index의 숫자보다 작다면
                   minIdx = j; // 가장 작은 인덱스 기록
                }
            }

            temp = arr[minIdx]; // 가장 작은 값을 기록
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }




    }





}
