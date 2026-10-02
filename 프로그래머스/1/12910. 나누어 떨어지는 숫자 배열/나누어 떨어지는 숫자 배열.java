import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            if(n%divisor==0) {
                count++;
                list.add(n);
            }
        }
        if(count == 0)
            return new int[] {-1};
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}