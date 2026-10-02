class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long cnt = a>b ? (long)a-b+1 : (long)b-a+1;
        answer = (long)(a+b)*cnt/2;
        return answer;
    }
}