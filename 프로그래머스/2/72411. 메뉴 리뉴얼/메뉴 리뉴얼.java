import java.util.*;
class Solution {
    
    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();
        for(int c : course) {
            Map<String, Integer> map = new HashMap<>();
            for(String order : orders) {
                char[] menus = order.toCharArray();
                Arrays.sort(menus);
                dfs(menus,c, 0, new StringBuilder(), map);
            }
            
            if(map.isEmpty())
                continue;
            
            int maxCnt = Collections.max(map.values());
            if(maxCnt<2)
                continue;
            
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue() == maxCnt) {
                    answer.add(entry.getKey());
                }
            }
        }
        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }
    
    private void dfs(char[] menus, int remains, int idx, StringBuilder sb, Map<String, Integer> map) {
        if(remains == 0) {
            String s = sb.toString();
            map.put(s, map.getOrDefault(s, 0) +1);
        }
        
        for(int i=idx; i<menus.length; i++) {
            sb.append(menus[i]);
            dfs(menus, remains-1, i+1, sb, map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}