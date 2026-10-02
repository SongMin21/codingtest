import java.util.*;
class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        // 인접리스트 생성
        // 연결된 노드, 도로를 지날 때 걸리는 시간
        List<List<int[]>> graph = new ArrayList<>();
        for(int i=0; i<N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int[] r : road) {
            graph.get(r[0]-1).add(new int[] {r[1]-1, r[2]});
            graph.get(r[1]-1).add(new int[] {r[0]-1, r[2]});
        }
        
        Queue<int[]> queue = new ArrayDeque<>();
        int[] min = new int[N];
        Arrays.fill(min, Integer.MAX_VALUE);
        queue.offer(new int[]{0, 0});
        min[0] = 0;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int node = cur[0];
            int weight = cur[1];
            for(int[] next : graph.get(node)) {
                int nextWeight = weight+next[1];
                if(min[next[0]] > nextWeight && K >= nextWeight) {
                    min[next[0]] = nextWeight;
                    queue.offer(new int[]{next[0], nextWeight});
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (min[i] <= K) {
                answer++;
            }
        }
        
        return answer;
    }
}