import java.lang.*;
class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 'z') {
                i+=3;
                sb.append(0);
            }
            else if(arr[i] == 'o') {
                i+=2;
                sb.append(1);
            }
            else if(arr[i] == 't') {
                if(arr[i+1] == 'w') {
                    i+=2;
                    sb.append(2);
                }
                else {
                    i+=4;
                    sb.append(3);
                }
            }
            else if(arr[i] == 'f') {
                if(arr[i+1] == 'o') {
                    i+=3;
                    sb.append(4);
                }
                else {
                    i+=3;
                    sb.append(5);
                }
            }
            else if(arr[i] == 's') {
                if(arr[i+1] == 'i') {
                    i+=2;
                    sb.append(6);
                }
                else {
                    i+=4;
                    sb.append(7);
                }
            }
            else if(arr[i] == 'e') {
                i+=4;
                sb.append(8);
            }
            else if(arr[i] == 'n') {
                i+=3;
                sb.append(9);
            }
            else {
                sb.append(arr[i]);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}