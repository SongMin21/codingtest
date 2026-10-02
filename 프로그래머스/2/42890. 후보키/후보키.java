import java.util.*;
class Solution {
    public int solution(String[][] relation) {
        int colLen = relation[0].length;
        int rowLen = relation.length;
        List<Integer> candidates = new ArrayList<>();
        
        
        for(int cols=0; cols<(1<<colLen); cols++) {
            // 최소성 검사
            boolean isMinimum = true;
            for(int key:candidates) {
                if((key&cols) == key) {
                    isMinimum = false;
                    break;
                }
            }
            if(!isMinimum) {
                continue;
            }
            
            // 유일성 검사
            Set<String> set = new HashSet<>();
            for(String[] row : relation) {
                StringBuilder sb = new StringBuilder();
                for(int c=0; c<colLen; c++) {
                    if((cols&(1<<c)) != 0) {
                        sb.append(row[c]).append(",");
                    }
                }
                set.add(sb.toString());
            }
            
            if(set.size() == rowLen) {
                candidates.add(cols);
            }
            
        }
        return candidates.size();
    }
}