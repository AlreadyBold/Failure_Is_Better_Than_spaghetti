class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (true) {
            if( n-a>-1){
                n = n-a;
                answer = answer+b;
                n = n+b;
            } else if(n-a == 0){
                answer = answer+b;
                n = n+b;
                break;
            } else if(n-a<0){
                break;
            }
        }
        return answer;
    }
}