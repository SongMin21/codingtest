import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length-1 == 0) {
            return new int[] {-1};
        }
        List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            list.add(n);
        }
        int min = Collections.min(list);
        
        int[] answer = new int[arr.length-1];
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(min == arr[i]) {
                continue;
            }
            answer[j++] = arr[i];
        }
        return answer;
    }
}