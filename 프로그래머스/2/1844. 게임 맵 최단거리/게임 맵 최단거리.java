import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int r = maps.length;
        int c = maps[0].length;
        
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[r][c];
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};
        
        queue.offer(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            if(cur[0]==r-1 && cur[1]==c-1) {
                return cur[2];
            }
            for(int i=0; i<4; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                
                if(nr>=0 && nr<r && nc>=0 && nc<c) {
                    if(maps[nr][nc] == 1 && !visited[nr][nc]) {
                        int dist = cur[2] + 1;
                        queue.offer(new int[]{nr, nc, dist});
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        
        return -1;
    }
}