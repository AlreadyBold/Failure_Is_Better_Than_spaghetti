class Solution {
    public int solution(int[] common) {
        int answer = 0;
        for(int i = 0 ; i<common.length; i++ ){
            if(!(common[i] == 0)){
                if( (common[i+1] - common[i]) == (common[i+2] - common[i+1])){
                    answer = common[common.length-1]+ (common[i+1] - common[i]);
                    break;
                } else if ( (common[i+1] / common[i]) == (common[i+2]/common[i+1])){
                    answer = common[common.length-1]* (common[i+1] / common[i]);
                    break;
                }
            }  
        }
        
        
        return answer;
    }
}