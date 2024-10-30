import java.util.*;
import java.io.*;
class Main {
    static int n;
    static int m;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        visited = new boolean[n+1];
        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    }
    
    static void dfs(int depth) {
        if (depth == m) {
            for(int i=0; i<arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i=1; i<=n; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            arr[depth] = i;
            
            dfs(depth+1);
            visited[i] = false;
        }
    }
}