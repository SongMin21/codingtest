class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        
        while(left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        String answer = new String(charArr);
        return answer;
    }
}