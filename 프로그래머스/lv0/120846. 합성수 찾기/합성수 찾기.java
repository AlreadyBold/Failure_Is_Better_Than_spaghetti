class Solution {
    public int solution(int n) {
        int answer = 0;
        for( int i = 1 ; i<=n ; i++ ){
            if( i > 8 ) {
                if ( i % 2 == 0 || i % 3 == 0 || i%5 == 0 || i%7 == 0){
                    answer ++;
                }
            } else {
                if ( i == 4|| i == 6 || i== 8 ){
                    answer ++;
                }
            }
        }
        return answer;
    }
}