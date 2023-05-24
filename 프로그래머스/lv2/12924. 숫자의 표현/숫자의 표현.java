class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 0;
        for(int i = 1; i<n; i++ ){
                count = i;
            for(int j = i+1; j<n; j++){
                count = count + j;
                if(count == n ){
                    answer ++;
                } else if(count > n) break;
            }
            
            
        }
        return answer;
    }
}