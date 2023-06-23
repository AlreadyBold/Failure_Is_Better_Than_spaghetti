import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        int answer = 0;
        Arrays.sort(arr,Collections.reverseOrder());
        if ( arr.length == 1 ){
            answer = citations[0];
        } else {
            for(int i = 0; i<arr.length; i++ ){
                if( arr[i] <= i ){
                    answer = i;
                    break;
                }
                if(i+1 == arr.length){
                    answer = arr.length;
                }
            }     
        }
        return answer;
    }
}