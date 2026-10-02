import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int count = 0;
        boolean[] visited = new boolean[n];
        List<List<Integer>> graph = new ArrayList<>(n);
        for(int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) {
                if(computers[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(i, graph, visited);
                count++;
            }
        }
        return count;
    }
    private void dfs(int start, List<List<Integer>> graph, boolean[] visited) {
        visited[start] = true;
        for(int next : graph.get(start)) {
            if(!visited[next]) {
                dfs(next, graph, visited);
            }
        }
    }
}