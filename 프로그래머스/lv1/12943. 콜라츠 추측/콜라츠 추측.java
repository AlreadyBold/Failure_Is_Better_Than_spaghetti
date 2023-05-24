class Solution {
    public int solution(int num) {
        int answer = 0;
        for(int i = 1 ; i<=500; i++){
            if( num == 1 ){
                break;
            }
            if(num %2 == 0) {
                num = num / 2 ;
            } else if(num %2 > 0 ){
                num = (num*3) + 1 ;
            }
            if(num == 1) {
                answer = i ;
                break;  
            } 
            if( i == 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}