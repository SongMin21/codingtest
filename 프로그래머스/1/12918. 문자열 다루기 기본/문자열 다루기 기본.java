class Solution {
    public boolean solution(String s) {
        String str = s.replaceAll("[^0-9]", "");
        int len = s.length();
        return s.equals(str) && (len == 4 || len == 6);
    }
}