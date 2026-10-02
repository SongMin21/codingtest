class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        for(int i=0; i<arr.length; i++) {
            String[] temp = arr[i].split("");
            for(int j=0; j<temp.length; j++) {
                if(j%2==0) {
                    answer += temp[j].toUpperCase();
                }
                else {
                    answer += temp[j].toLowerCase();
                }
            }
            if(i != arr.length - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}