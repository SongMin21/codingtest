import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int cnt = t.length()-p.length()+1;
        long[] nums = new long[cnt];
        
        for(int i=0; i<cnt; i++) {
            // System.out.println(i);
            String temp = t.substring(i,i+p.length());
            nums[i] = Long.parseLong(temp);
        }
        // System.out.println(Arrays.toString(nums));
        long pLong = Long.parseLong(p);
        for(long l : nums) {
            if(l<=pLong) {
                answer++;
            }
        }
        return answer;
    }
}