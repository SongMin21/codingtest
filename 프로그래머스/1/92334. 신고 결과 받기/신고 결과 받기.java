import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;
        int[] answer = new int[n];
        Set<String> set = new HashSet<>(Arrays.asList(report));
        Map<String, Integer> map = new HashMap<>(n);
        for(String s : id_list) {
            map.put(s, 0);
        }
        
        // 신고 당한 횟수 계산
        for(String s : set) {
            String reported = s.split(" ")[1];
            if(!map.isEmpty() && map.containsKey(reported)) {
                int num = map.get(reported) + 1;
                map.put(reported, num);
            }
        }
        // System.out.println(map);
        
        for(String s : set) {
            String[] user = s.split(" ");
            if(!map.isEmpty() && map.containsKey(user[1])) {
                int num = map.get(user[1]);
                if(num >= k) {
                    int index = indexOf(user[0], id_list);
                    answer[index]++;
                }
            }
        }
        return answer;
    }
    private int indexOf(String s, String[] list) {
        int index = -1;
        for(int i=0; i<list.length; i++) {
            if(s.equals(list[i])) {
                index = i;
            }
        }
        return index;
    }
}