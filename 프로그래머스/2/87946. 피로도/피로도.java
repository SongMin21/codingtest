class Solution {
    public int solution(int k, int[][] dungeons) {
        return dfs(k, dungeons, new boolean[dungeons.length], 0);
    }
    
    private int dfs(int k, int[][] dungeons, boolean[] visited, int count) {
        int maxCount = count;
        
        for(int i=0; i<dungeons.length; i++) {
            int minRequired = dungeons[i][0];
            int cost = dungeons[i][1];
            
            if(!visited[i] && k>=minRequired) {
                visited[i] = true;
                int subCount = dfs(k-cost, dungeons, visited, count+1);
                maxCount = Math.max(maxCount, subCount);
                visited[i] = false;
            }
        }
        return maxCount;
    }
}