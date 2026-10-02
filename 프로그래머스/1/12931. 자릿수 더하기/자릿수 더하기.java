import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String s = String.valueOf(n);
        // System.out.println(s);
        for(String str : s.split("")) {
            int num = Integer.parseInt(str);
            answer += num;
        }
        return answer;
    }
}