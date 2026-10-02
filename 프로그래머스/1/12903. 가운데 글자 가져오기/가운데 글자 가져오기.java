class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        if(arr.length % 2 == 0) {
            answer += arr[arr.length/2-1];
        }
        answer += arr[arr.length/2];
        return answer;
    }
}