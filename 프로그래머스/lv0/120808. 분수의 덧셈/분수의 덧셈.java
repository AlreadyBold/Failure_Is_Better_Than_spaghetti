class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int k = 0;
        answer[1] = denom1 * denom2;
        answer[0] = (numer1 * denom2) + (numer2 * denom1);
        if( answer[1]>answer[0] ) k = answer[0];
        else if ( answer[1] < answer[0] ) k = answer[1];
        else if (answer[1] == answer[0] ) {
            answer[0] = 1;
            answer[1] = 1;
            return answer;
        }
        
        
        for(int i = k; i>1; i-- ){
            if ( answer[0]%i == 0 && answer[1]%i == 0 ){
                answer[0] = answer[0]/i;
                answer[1] = answer[1]/i;
            }
        }
        
        
        
        
        
        
        return answer;
    }
}