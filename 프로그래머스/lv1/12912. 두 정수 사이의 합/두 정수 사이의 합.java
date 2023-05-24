class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if( a>b) {
            int k = a;
            a= b;
            b= k;
        }
        for(int i = a; i<=b; i++){
            answer = answer + (long)i;
        }
        
        
        
        
        
        return answer;
    }
}