import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i =0; i<queries.length; i++ ){
            int index = 1000000 ;
            for(int j = queries[i][0]; j<=queries[i][1]; j++ ){
                if( arr[j] > queries[i][2] && arr[j] < index ){
                    answer[i] = arr[j];
                    index = arr[j];
                }
                if ( j == queries[i][1] && index == 1000000){
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}