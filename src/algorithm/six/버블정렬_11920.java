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
            
            
            // 낮은숫자순으로 우선순위가장높음 -> poll시 가장 먼저 나옴
            // 큰 값이 들어오면 큐에 남겨두고, 기존에 있던 값 중 가장 작은값을 꺼냄
            // K만큼 돌았을 때 큰값들은 뒤에 정렬되어있음
            if(i >= K){ // K보다 같거나 크면 출력하기 -> 큐에 K개 유지
                sb.append(pq.poll()).append(" ");
            }
        }

        while(!pq.isEmpty()){ // 사이즈가 K만큼 유지되도록 하기 위해
            sb.append(pq.poll()).append(" ");
        }

        System.out.print(sb);

    }


}
