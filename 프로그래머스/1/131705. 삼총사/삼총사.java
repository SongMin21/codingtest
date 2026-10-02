import java.util.*;
class Solution {
    List<List<Integer>> list;
    public int solution(int[] number) {
        list = new ArrayList<>();
        dfs(0, number, new ArrayList<>());
        return list.size();
    }
    private void dfs(int start, int[] number, List<Integer> cur) {
        if(cur.size() == 3) {
            // System.out.println(cur);
            if(cur.get(0) + cur.get(1) + cur.get(2) == 0) {
                list.add(new ArrayList<>(cur));
            }
            return;
        }
        
        for(int i=start; i<number.length; i++) {
            cur.add(number[i]);
            dfs(i+1, number, cur);
            cur.remove(cur.size()-1);    
        }
    }
}