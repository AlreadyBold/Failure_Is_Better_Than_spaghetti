import java.math.BigInteger;;
class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger ball = new BigInteger("1");
        BigInteger sharee = new BigInteger("1");
        BigInteger bms = new BigInteger("1");
        for(int i=1; i<=balls; i++){
            ball = ball.multiply(BigInteger.valueOf(i));
        }
        for(int i=1; i<=share; i++){
        	sharee = sharee.multiply(BigInteger.valueOf(i));
        }
        for(int i=1; i<=balls-share; i++){
        	bms = bms.multiply(BigInteger.valueOf(i));
        }
        
        BigInteger answer = ball.divide((bms.multiply(sharee)));
        
        
        return answer;
    }
}