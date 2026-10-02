import java.util.*;
class Solution {
    List<List<Integer>> graph;
    boolean[] visited;
    int[] subTrees;
    public int solution(int n, int[][] wires) {
        // 인접 리스트 생성
        graph = new ArrayList<>(n);
        for(int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int[] wire : wires) {
            graph.get(wire[0]-1).add(wire[1]-1);
            graph.get(wire[1]-1).add(wire[0]-1);
        }
        
        visited = new boolean[n];
        subTrees = new int[n];
        int answer = 1000000;
        dfs(0);
        
        for(int i=0; i<n; i++) {
            int diff = Math.abs(n-2*subTrees[i]);
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private void dfs(int node) {
        visited[node] = true;
        subTrees[node] = 1;
        
        for(int next : graph.get(node)) {
            if(!visited[next]) {
                dfs(next);
                subTrees[node] += subTrees[next];
            }
        }
    }
}