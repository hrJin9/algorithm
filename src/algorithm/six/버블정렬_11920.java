package algorithm.six;
import java.util.*;

public class 버블정렬_11920 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열의 개수
        int K = sc.nextInt(); // 반복 횟수
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        solution(arr, K);

    }

    private static void solution(int[] arr, int K){
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.offer(arr[i]); // pq에 i번째 넣기

            if(i >= K){ // K보다 같거나 크면 넣기
                sb.append(pq.poll()).append(" ");
            }
        }

        while(!pq.isEmpty()){
            sb.append(pq.poll()).append(" ");
        }

        System.out.print(sb);

    }


}
