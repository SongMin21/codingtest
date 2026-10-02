class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        String[] arr = s.split("");
        int[] answer = new int[arr.length];
        // System.out.println(arr.length);
        for(int i=arr.length-1; i>=0; i--) {
            // System.out.println(i);
            int num = Integer.parseInt(arr[i]);
            // System.out.println(arr.length-1-i);
            answer[(arr.length-1)-i] = num;
        }
        return answer;
    }
}