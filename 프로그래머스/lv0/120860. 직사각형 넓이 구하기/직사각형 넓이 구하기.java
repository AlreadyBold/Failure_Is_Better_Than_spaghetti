import java.math.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int X = 0;
        int Y = 0;
        for(int i=1; i<dots.length; i++){
            if(dots[0][0] == dots[i][0]){
                Y = dots[0][1] - dots[i][1];
            }
            if(dots[0][1] == dots[i][1]){
                X = dots[0][0] - dots[i][0];
            }
            
        }
        answer = Math.abs(X*Y);        
        
        return answer;
    }
}