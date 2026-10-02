class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] isConsist = new boolean[10];
        for(int i=0; i<numbers.length; i++) {
            int n = numbers[i];
            if(!isConsist[n]) {
                isConsist[n] = true;
            }
        }
        
        for(int i=0; i<10; i++) {
            if(!isConsist[i]) {
                answer += i;
            }
        }
        return answer;
    }
}