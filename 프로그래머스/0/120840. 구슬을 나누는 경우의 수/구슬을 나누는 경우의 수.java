import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        BigInteger n = BigInteger.ONE;
        BigInteger nm = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;
        BigInteger answer = BigInteger.ZERO;
        if((balls-share) == 0 || share == 0) {
            answer = BigInteger.ONE;
        }
        else {
            for(int i=1; i<=balls; i++) {
                n = n.multiply(BigInteger.valueOf(i));
            }
            for(int i=1; i<=(balls-share); i++) {
                nm = nm.multiply(BigInteger.valueOf(i));
            }
            for(int i=1; i<=share; i++) {
                m = m.multiply(BigInteger.valueOf(i));
            }
            answer = n.divide(nm.multiply(m));
        }
        return answer.intValue();
    }
}