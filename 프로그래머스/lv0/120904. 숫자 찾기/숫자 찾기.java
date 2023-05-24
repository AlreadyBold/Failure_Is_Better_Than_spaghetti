import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int[] arr = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i<arr.length; i++){
            if( k == arr[i] ){
                answer = i+1;
                break;
            }
            if (i == arr.length-1) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}