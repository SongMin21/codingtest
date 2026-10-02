class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int pCnt = 0;
        int yCnt = 0;
        for(char str : arr) {
            if(str == 'p') {
                pCnt++;
            }
            else if(str == 'y') {
                yCnt++;
            }
        }

        return pCnt==yCnt;
    }
}