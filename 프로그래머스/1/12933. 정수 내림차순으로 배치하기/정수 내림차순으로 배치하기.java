import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        // System.out.println(Arrays.toString(arr));
        s = String.join("",arr);
        // System.out.println(s);
        answer = Long.parseLong(s);
        return answer;
    }
}