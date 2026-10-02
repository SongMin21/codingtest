class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom = denom1 * denom2;
        int numer = numer1*denom2 + numer2*denom1;
        
        int temp = 1;
        int a = numer, b = denom;
        while(temp !=0) {
            temp = a%b;
            a = b;
            b = temp;
        }
        
        answer[0] = numer/a;
        answer[1] = denom/a;
        return answer;
    }
}