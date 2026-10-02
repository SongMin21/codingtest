import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        // 간선 리스트 -> 인접리스트
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] e : edge) {
            graph.get(e[0]-1).add(e[1]-1);
            graph.get(e[1]-1).add(e[0]-1);
        }
        // System.out.println(graph);
        
        Queue<int[]> queue = new ArrayDeque<>(n);
        boolean[] visited = new boolean[n];
        int maxDist = 0;
        int count = 1;
        
        queue.offer(new int[] {0,0,0});
        visited[0] = true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            if(cur[1] > maxDist) {
                count = 1;
                maxDist = cur[1];
            }
            else {
                count++;
            }
            for(int next : graph.get(cur[0])) {
                if(!visited[next]) {
                    int dist = cur[1] + 1;
                    queue.offer(new int[]{next, dist});
                    visited[next] = true;
                }
            }
        }
        return count;
    }
}