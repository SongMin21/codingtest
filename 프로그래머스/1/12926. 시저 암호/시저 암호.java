class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            int num = arr[i] - 'A';
            if(num>=0 && num<=25) {
                // 대문자
                int temp = num+n;
                arr[i]=(char)(temp%26+'A');
            } else if(num>=32 && num<=57) {
                // 소문자
                int temp = num+n-32;
                arr[i]=(char)(temp%26+'a');
            }
        }
        return String.valueOf(arr);
    }
}