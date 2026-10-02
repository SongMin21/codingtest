import java.util.*;
class Solution {
    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        dfs(numbers, "", new boolean[numbers.length()], set);
        return set.size();
    }
    
    private void dfs(String numbers, String cur, boolean[] visited, Set<Integer> set) {
        if(cur.length() != 0) {
            int n = Integer.parseInt(cur);
            if(isPrime(n))
                set.add(n);
        }
        
        for(int i=0; i<numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(numbers, cur+numbers.charAt(i), visited, set);
                visited[i] = false;
            }
        }
    }
    private boolean isPrime(int n) {
        if(n<2)
            return false;
        for(int i=2; i*i<=n; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}