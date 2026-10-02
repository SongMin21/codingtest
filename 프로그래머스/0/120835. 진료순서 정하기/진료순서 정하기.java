import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        Integer[] sorted = new Integer[length];
        for(int i=0; i<length; i++) {
            sorted[i] = emergency[i];
        }
        Arrays.sort(sorted, Collections.reverseOrder());
        for(int i=0; i<length; i++) {
            for(int j=0; j<length; j++) {
                if(sorted[j] == emergency[i]) {
                    answer[i] = ++j;
                    break;
                }
            }
        }
        return answer;
    }
}