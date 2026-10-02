class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0,0);
    }
    private int dfs(int[] numbers, int target, int idx, int sum) {
        if(numbers.length == idx) {
            return (sum==target) ? 1: 0;
        }
        
        int count = 0;
        count += dfs(numbers, target, idx+1, sum+numbers[idx]);
        count += dfs(numbers, target, idx+1, sum-numbers[idx]);
        
        return count;
    }
}