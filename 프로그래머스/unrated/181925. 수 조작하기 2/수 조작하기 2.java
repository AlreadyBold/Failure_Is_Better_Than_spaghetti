class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 0 ;i<numLog.length-1; i++){
            if(numLog[i+1] > numLog[i] + 9 ){
                answer = answer + 'd';
            } else if (numLog[i+1] > numLog[i]){
                answer = answer + 'w';
            } else if (numLog[i+1] < numLog[i] -9){
                answer = answer + 'a';
            } else if (numLog[i+1] < numLog[i]){
                answer = answer + 's';
            }
        }
        
        
        return answer;
    }
}