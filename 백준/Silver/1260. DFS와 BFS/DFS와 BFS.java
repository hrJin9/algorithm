import java.io.*;
import java.util.*;

public class Main {
    
    public static StringBuilder sb = new StringBuilder();
    public static boolean[] visited_dfs;
    public static boolean[] visited_bfs;
    public static int[][] arr;
    public static Deque<Integer> stack = new ArrayDeque<>();
    public static Deque<Integer> q = new ArrayDeque<>();
    
    public static int N;
    public static int M;
    public static int V;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        
        // 인덱스가 아닌 숫자(N)으로 접근할 수 있도록 +1해서 초기화한다.
        arr = new int[N+1][N+1];
        visited_dfs = new boolean[N+1];
        visited_bfs = new boolean[N+1];
        
        // 간선 정보 입력
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }
        
        dfs(V);
        bfs(V);
        System.out.println(sb);
    }
    
    // 재귀
    public static void dfs(int x) {
        visited_dfs[x] = true; // 이어진 정점일 경우 방문 기록을 남긴다.
        sb.append(x).append(" ");
        for (int i=1; i<= N; i++) {
            if(arr[x][i] == 1 && !visited_dfs[i]) { // 이어진 정점과, 방문하지 않은 정점만을 비교한다.
                dfs(i);
            }
        }
    }
    
    // 스택 + 재귀
    public static void dfs_st(int x) {
        visited_dfs[x] = true;
        sb.append("\n").append(x).append(" ");
        stack.push(x);
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            for (int i=1; i<=N; i++) {
                if(arr[cur][i] == 1 && !visited_dfs[i]) {
                    stack.push(i);
                    sb.append(i).append(" ");
                    dfs_st(i);
                }
            }

        }
    }
    
    
    // queue
    public static void bfs(int x) {
        visited_bfs[x] = true;
        sb.append("\n").append(x).append(" ");
        q.offer(x);
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int i=1; i<=N; i++) {
                if(arr[cur][i] == 1 && !visited_bfs[i]) {
                    q.offer(i);
                    visited_bfs[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }
    
}