class Solution {
    public int solution(int num) {
        if (num == 1)
            return 0;
        
        int answer = 0;
        long n = num;
        for(int i=0; i<500; i++) {    
            if(n%2==0) {
                n /= 2;
            }
            else {
                n = n * 3 + 1;
            }
            answer++;
            
            if(n==1) {
                return answer;
            }
        }
        return -1;
    }
}