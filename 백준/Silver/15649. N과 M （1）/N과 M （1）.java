import java.util.*;

public class Main {

    private static int N;
    private static int M;
    private static boolean[] visited;
    private static int[] arr;
    private static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sb = new StringBuilder();
        solution(N, M);
        System.out.println(sb);
    }

    private static int solution(int N, int M){
        int answer = 0;
        visited = new boolean[N+1];
        arr = new int[M];
        DFS(0);
        return answer;
    }

    private static void DFS(int depth){
        if (depth == M){
            for(int x : arr){
                sb.append(x).append(" ");
            }
            sb.append("\n");
        } else {
            for(int i=1; i<=N; i++){
                if(visited[i])
                    continue;
                visited[i] = true;
                arr[depth] = i;
                DFS(depth + 1);
                visited[i] = false;
            }
        }
    }



}
