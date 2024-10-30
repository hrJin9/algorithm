import java.util.*;
import java.io.*;

class Main {
    
    static int k;
    static char[] arr;
    static char[] cur;
    static boolean[] visited;
    static StringBuilder sb;
    static int count;
    static String answer;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while((line=br.readLine()) != null) {
            // 초기화 작업
            StringTokenizer st = new StringTokenizer(line);
            answer = "No permutation";
            count = 0;
            sb = new StringBuilder();
            String str = st.nextToken();
            k = Integer.parseInt(st.nextToken());
            arr = str.toCharArray();
            cur = new char[arr.length];
            visited = new boolean[arr.length];
            
            dfs(0);
            
            sb.append(str).append(" ").append(k).append(" = ").append(answer);
            System.out.println(sb);
        }
        
    }
    
    static void dfs(int depth) {
        if(depth == arr.length) {
            count++; // 만들어진 순열의 번호
            if(count == k) {
                answer = new String(cur);
            }
            return;
        }
        
        for(int i=0; i<arr.length; i++) {
            if(visited[i])
                continue;
            
            visited[i] = true;
            cur[depth] = arr[i];
            
            dfs(depth + 1);
            visited[i] = false;
        }
        
        
    }
}