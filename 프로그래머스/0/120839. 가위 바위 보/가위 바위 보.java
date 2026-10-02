class Solution {
    public String solution(String rsp) {
        char[] arr = rsp.toCharArray();
        for(int i=0; i<arr.length; i++) {
            // System.out.println(a);
            switch(arr[i]) {
                case '2':
                    arr[i] = '0';
                    break;
                case '0':
                    arr[i] = '5';
                    break;
                case '5':
                    arr[i] = '2';
                    break;
            }
        }
        return new String(arr);
    }
}