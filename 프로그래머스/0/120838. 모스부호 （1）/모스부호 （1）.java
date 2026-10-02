class Solution {
    public String solution(String letter) {
        String[] arr = letter.split(" ");
        char[] answer = new char[arr.length];
        String[] morse = {
    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", 
    "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", 
    "..-", "...-", ".--", "-..-", "-.--", "--.."
};
        for(int i=0; i<arr.length; i++) {
            // System.out.println(a);
            for(int j=0; j<morse.length; j++) {
                if(morse[j].equals(arr[i])) {
                    answer[i] = (char)('a'+ j);
                }
            }
        }
        
        
        return new String(answer);
    }
}