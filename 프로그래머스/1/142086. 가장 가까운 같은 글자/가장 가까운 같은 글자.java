import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] letters = new int[26];
        Arrays.fill(letters, -1);
        
        char[] arr = s.toCharArray();
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            int n = arr[i]-'a';
            answer[i] = letters[n] == -1 ? -1 : i-letters[n];
            letters[n] = i;
        }
        
        return answer;
    }
}