class Solution {
    public int solution(int n) {
        int a = 1;
        int answer = 0;
        for(int i = 1; i <=10 ; i++ ){
            a = a*i;
            for(int j = 1; j<=i-1 ; j++){
               a = a*j; 
            }
            if ( a > n ){
                answer = i-1;
                break;
            } else if ( a == n) {
                answer = i;
                break;
            } else {
                a = 1;
            }
        }
        return answer;
    }
}