class Solution {
    public String solution(String my_string, int n) {
        char[] charArr = my_string.toCharArray();
        char[] answer = new char[charArr.length * n];
        int k = 0;
        for(int i =0; i<charArr.length; i++) {
            for(int j=0; j<n; j++) {
                answer[k++] = charArr[i];
            }
        }
        return new String(answer);
    }
}