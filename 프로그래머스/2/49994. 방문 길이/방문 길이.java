import java.util.*;

class Solution {
    public int solution(String dirs) {
        int curx = 0;
        int cury = 0;
        Set<String> visited = new HashSet<>();
        
        int[] dx = {0, 0, -1, 1}; 
        int[] dy = {1, -1, 0, 0}; 
        
        for(char c : dirs.toCharArray()) {
            int idx = "UDLR".indexOf(c);
            int nx = curx + dx[idx];
            int ny = cury + dy[idx];
            
            if(nx < -5 || nx > 5 || ny < -5 || ny > 5)
                continue;
            
            String path1 = curx + "," + cury + "->" + nx + "," + ny;
            String path2 = nx + "," + ny + "->" + curx + "," + cury;
            
            visited.add(path1);
            visited.add(path2);
            
            curx = nx;
            cury = ny;
            
        }
        
        return visited.size() / 2;
    }
}