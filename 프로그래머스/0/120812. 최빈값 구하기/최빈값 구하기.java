import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int curVal = array[0];  // 현재 비교하는 값
        int maxVal = array[0];  // 현재 최빈값
        int curCnt = 0; // 빈도수
        int maxCnt = 0; // 최빈도수
        int isSeveral = -1;
        for(int i=0; i<array.length; i++) {
            if(array[i] == curVal) {
                curCnt++;
            }
            else {
                if(curCnt > maxCnt) {
                    maxCnt = curCnt;
                    maxVal = array[i-1];
                }
                else if(curCnt == maxCnt) {
                    maxVal = -1;
                }
                curCnt = 1;
                curVal = array[i];
            }
        }
        if(curCnt > maxCnt) {
            maxVal = curVal;
        }
        else if(curCnt == maxCnt){
            maxVal = -1;
        }
        answer = maxVal;
        return answer;
    }
}