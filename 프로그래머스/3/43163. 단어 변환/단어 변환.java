import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean hasTarget = false;
        for(String s : words) {
            if(target.equals(s)) {
                hasTarget = true;
            }
        }
        if(hasTarget == false)
            return 0;
        
        // 인접리스트 생성
        int n = words.length;
        Map<String, List<String>> graph = new HashMap<>(n);
        for(String s : words) {
            graph.put(s, new ArrayList<>());
        }
        graph.put(begin, new ArrayList<>());
        
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(isConnected(words[i], words[j])) {
                    graph.get(words[i]).add(words[j]);
                    graph.get(words[j]).add(words[i]);
                }
            }
            
            if(isConnected(begin, words[i])) {
                graph.get(begin).add(words[i]);
                graph.get(words[i]).add(begin);
            }
        }
        // System.out.println(graph);
        
        // bfs
        Queue<String> queue = new ArrayDeque<>(n);
        Map<String, Integer> visited = new HashMap<>();
        queue.offer(begin);
        visited.put(begin, 0);
        
        while(!queue.isEmpty()) {
            String cur = queue.poll();
            if(cur.equals(target)) {
                return visited.get(cur);
            }
            for(String next : graph.get(cur)) {
                if(!visited.containsKey(next)) {
                    int dist = visited.get(cur) + 1;
                    queue.offer(next);
                    visited.put(next, dist);
                }
            }
        }
        return 0;
    }
    
    private boolean isConnected(String s1, String s2) {
        int count = 0;
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        return (count==1);
    }
}