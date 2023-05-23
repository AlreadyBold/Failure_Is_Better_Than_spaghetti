import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i<food.length; i++ ){
            for(int j = 1; j<=(food[i]/2); j++){
                answer = answer + (String.valueOf(i));
            }
        }
        StringBuilder reverse = new StringBuilder(answer);
        reverse = reverse.reverse();
        answer = answer + "0" + reverse.toString();
        return answer;
    }
}