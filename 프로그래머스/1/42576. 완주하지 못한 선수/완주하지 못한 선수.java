import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 동명이인 처리 -> Map<String, Integer> -> 동명이인 수
        Map<String, Integer> map = new HashMap<>();
        for(String s : participant) {
            if(!map.isEmpty() && map.containsKey(s)) {
                int num = map.get(s) + 1;
                map.put(s, num);
            }
            else {
                map.put(s, 1);
            }
        }
        
        // completion 순회
        for(String s : completion) {
            if(!map.isEmpty() && map.containsKey(s)) {
                int num = map.get(s) - 1;
                map.put(s, num);
            }
        }
        
        for(String s : map.keySet()) {
            if(map.get(s) == 1) {
                answer = s;
            }
        }
        return answer;
    }
}