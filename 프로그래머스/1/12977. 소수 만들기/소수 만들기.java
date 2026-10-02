class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        int length = nums.length;
        for(int i=0; i<length-2; i++) {
            for(int j=i+1; j<length-1; j++) {
                for(int k=j+1; k<length; k++) {
                    boolean isPrime = true;
                    sum = nums[i] + nums[j] + nums[k];
                    for(int n=2; n*n<=sum; n++) {
                        if(sum%n == 0) {
                            isPrime = false;
                        }
                    }
                    if(isPrime == true) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}