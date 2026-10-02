class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            int n = (int)Math.sqrt(i);
            if(n*n == i) {
                answer-=i;
                continue;
            }
            answer+=i;
        }
        return answer;
    }
}