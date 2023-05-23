import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count = 0; // 현재카운트
        int cc = 0; // 최대카운트
        int ccc = 0;
        Arrays.sort(array);
        if(array.length == 1 ){
            answer = array[0];
        }else {
            for(int i = 1; i<array.length; i++){
                if(array[i-1] == array[i]){
                    count++;
                } else if(!(array[i-1] == array[i]) ){
                    count = 0;
                }
                if (ccc < count){
                ccc = cc;   
                }
                if (cc < count){
                    cc = count;
                    answer = array[i];
                } 
                if(ccc == cc){
                    answer = -1;
                }
            }
        }

        return answer;
    }
}