import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            if(i==0) {
                stack.push(i);
            }
            else {
                while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                    int index = stack.pop();
                    answer[index] = i - index;
                }
                stack.push(i);
            }
        }
        while(!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = n - 1 - index;
        }
        return answer;
    }
}