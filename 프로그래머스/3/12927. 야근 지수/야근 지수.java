import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int t = 0;
        for(int i : works)
            t+=i;
        if(t<n)
            return 0;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b-a);
        
        for(int w: works) {
            q.offer(w);
        }
        
        for(int i=0; i<n; i++) {
            int mw = q.poll();
            mw--;
            q.offer(mw);
        }
        
        while(!q.isEmpty()) {
            int w = q.poll();
            answer += (long)w * w;
        }
        return answer;
    }
}