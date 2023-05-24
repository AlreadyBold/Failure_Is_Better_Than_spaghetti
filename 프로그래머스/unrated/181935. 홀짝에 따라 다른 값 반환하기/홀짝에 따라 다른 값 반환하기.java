class Solution {
    public int solution(int n) {
        int answer = 0;
        if ( n % 2 == 0 ){
            n = n/2;
            for(int i=1; i<=n; i++){
                answer = answer + ((i*2)*(i*2)) ;
            }
        } else {
            n = n/2;
            for(int i=1; i<=n+1; i++){
                answer = answer + (i*2)-1;
            }
        }
        return answer;
    }
}