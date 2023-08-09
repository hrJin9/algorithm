package algorithm.six;
import java.util.*;

public class 버블소트_1517 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        solution(0, arr.length - 1);

    }

    private static void solution(int left, int right){
        if(left < right) {
            int mid = (left + right) >> 1;
        }


//        int count = 0;

//        for(int i=0; i<arr.length; i++){
//            for(int j=1; j<arr.length-i; j++){
//                if(arr[j-1] > arr[j]){
//                    temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                    count++;
//                }
//            }
//        }

//        return count;
    }



}
