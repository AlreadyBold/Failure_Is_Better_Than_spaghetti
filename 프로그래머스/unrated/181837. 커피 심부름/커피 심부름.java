import java.util.*;
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0 ; i<order.length; i++ ){
            if(order[i].contains("cafelatte")){
                answer = answer+ 5000;
            } else {
                answer = answer + 4500;
            }
        }
        
        
        return answer;
    }
}