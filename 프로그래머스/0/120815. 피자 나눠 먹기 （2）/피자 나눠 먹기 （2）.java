class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = n;
        int b = 6;
        int temp = -1;
        while(temp != 0) {
            temp = a%b;
            a = b;
            b = temp;
        }
        answer = n / a;
        return answer;
    }
}