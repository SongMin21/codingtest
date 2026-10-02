class Solution {
    public String solution(int age) {
        String s = String.valueOf(age);
        String answer = "";
        
        for (char c : s.toCharArray()) {
            answer += (char) ((c - '0') + 97);
        }
        return answer;
    }
}