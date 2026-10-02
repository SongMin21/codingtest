import java.util.*;
class Solution {
    public int solution(String[] maps) {
        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];
        int r = maps.length;
        int c = maps[0].length();
        
        char[][] mapArr = new char[r][c];
        for(int i=0; i<r; i++) {
            char[] tmp = maps[i].toCharArray();
            for(int j=0; j<c; j++) {
                mapArr[i][j] = tmp[j];
                if(mapArr[i][j] == 'S') {
                    start[0] = i;
                    start[1] = j;
                }
                else if(mapArr[i][j] == 'E') {
                    exit[0] = i;
                    exit[1] = j;
                }
                else if(mapArr[i][j] == 'L') {
                    lever[0] = i;
                    lever[1] = j;
                }
            }
        }
        
        int firstBFS = bfs(start, lever, mapArr);
        int secondBFS = bfs(lever, exit, mapArr);
        if(firstBFS == -1 || secondBFS == -1) {
            return -1;
        }
        else {
            return firstBFS + secondBFS;
        }
    }
    private int bfs(int[] start, int[] end, char[][] maps) {
        int r = maps.length;
        int c = maps[0].length;
        boolean[][] visited = new boolean[r][c];
        Queue<int[]> queue = new ArrayDeque<>();
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};
        
        queue.offer(new int[] {start[0], start[1], 0});
        visited[start[0]][start[1]] = true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            if(cur[0]==end[0] && cur[1]==end[1]) {
                return cur[2];
            }
            for(int i=0; i<4; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                
                if(nr>=0 && nr<r && nc>=0 && nc<c) {
                    if(maps[nr][nc] != 'X' && !visited[nr][nc]) {
                        int dist = cur[2] + 1;
                        queue.offer(new int[] {nr,nc,dist});
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        return -1;
    }
}