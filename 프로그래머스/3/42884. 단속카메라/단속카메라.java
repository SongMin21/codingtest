import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (o1, o2) -> Integer.compare(o1[1], o2[1]));
        int answer = 0;
        int position = -30001;
        
        for(int[] r : routes) {
            int entry = r[0];
            int exit = r[1];
            
            if(entry > position) {
                answer++;
                position = exit;
            }
        }
        
        return answer;
    }
}