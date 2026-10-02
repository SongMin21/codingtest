class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int cnt = money/5500;
        int change = money%5500;
        
        answer[0] = cnt;
        answer[1] = change;
        return answer;
    }
}