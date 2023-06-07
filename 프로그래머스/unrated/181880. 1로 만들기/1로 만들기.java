import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<1000; j++){
                if(num_list[i] == 1) {
                    break;
                } else {
                    num_list[i] = num_list[i] / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}