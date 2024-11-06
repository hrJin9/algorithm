import java.util.*;

class Solution {
    static class Node implements Comparable<Node>{
        int index;
        int cost;
        
        public Node(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Node o) {
            return this.cost > o.cost ? 1 : -1;
        }
    }
    
    public int solution(int N, int[][] road, int K) {
        
        int answer = 0;
        
        int[][] map = new int[N+1][N+1];
        for(int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                map[i][j] = Integer.MAX_VALUE;
            }
        }
        
        for(int i=0; i<road.length; i++) {
            int a = road[i][0];
            int b = road[i][1];
            int w = road[i][2];
            
            map[a][b] = map[b][a] = Math.min(map[a][b], w);
            
        }
        
        // 초기화
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        boolean[] visited  = new boolean[N+1];
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(1, 0));
        
        while(!pq.isEmpty()) {
            Node now_node = pq.poll();
            int now_idx = now_node.index;
            int now_cost = now_node.cost;
            
            if(visited[now_idx])
                continue;
            visited[now_idx] = true;
            
            // 인접 노드 탐색
            for(int i=1; i<=N; i++) {
                if(map[now_idx][i] < Integer.MAX_VALUE && !visited[i]) {
                    int new_cost = now_cost + map[now_idx][i];
                    if(dist[i] > new_cost) {
                        dist[i] = new_cost;
                        pq.offer(new Node(i, new_cost));
                    }
                }
            }
        }
        
        // K 시간 이하로 배달 가능한 지역
        for (int i=1; i<=N; i++) {
            if(dist[i] <= K) 
                answer++;
        }
        
        return answer;
    }
        
}
    
