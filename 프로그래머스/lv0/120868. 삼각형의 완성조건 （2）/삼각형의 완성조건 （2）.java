import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if(sides[1]-sides[0] == 1) answer = 1;
        else {
            for(int i=1; i<=sides[1]; i++){
                if(sides[0]+i > sides[1]) answer++;
            }
            for(int i=sides[1]+1; i<sides[0]+sides[1]; i++){
                answer++;
            }
             
        }
        
        return answer;
    }
}