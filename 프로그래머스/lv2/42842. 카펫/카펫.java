class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
        // XY -2X - 2Y +4 == YELLOW
        // 넓이로 접근해보는것
        int sum = brown + yellow;
        int valid = 0;
        for(int i=3; i<10000; i++ ){
            for(int j=1; j<=i; j++){
                if( i>=j && i*j == sum){
                    if(i*j -2*i - 2*j +4 == yellow) { 
                        valid = 1;
                        answer[0] = i;
                        answer[1] = j;
                    }
                }
            }
            if (valid == 1) break;
        }
        
        
        
        return answer;
    }
}