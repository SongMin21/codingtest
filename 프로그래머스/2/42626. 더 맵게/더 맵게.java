import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int s : scoville) {
            q.offer(s);
        }
        
        while(q.peek() < K) {
            int ms1 = q.poll();
            int ms2 = q.poll();
            
            int mixed = ms1 + (ms2*2);
            q.offer(mixed);
            answer++;
            
            if(q.size() == 1 && q.peek() < K) {
                return -1;
            }
        }
        
        return answer;
    }
}