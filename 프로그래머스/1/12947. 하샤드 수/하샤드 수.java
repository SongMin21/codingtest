class Solution {
    public boolean solution(int x) {
        String s = String.valueOf(x);
        String[] arr = s.split("");
        int sum = 0;
        for(String str : arr) {
            sum += Integer.parseInt(str);
        }
        return x%sum == 0;
    }
}