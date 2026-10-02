import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int n : arr) {
            if(!stack.isEmpty() && stack.peek() == n) {
                continue;
            }
            else {
                stack.push(n);
            }
        }
        // System.out.println(stack);
        int n = stack.size();
        int[] answer = new int[n];
        for(int i=n-1; i>=0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}