import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int[] arrs = arr.clone();
        int[] arrsn = new int [1];
        arrsn[0] = -1;
        Arrays.sort(arrs); 
        int j = 0;
        
        
        if(arr.length == 1 ) {
            return arrsn;
        } else {
            for(int i = 0; i<arr.length;  i++ ){
                if(arrs[0] == arr[i]) {
                } else {
                    answer[j] = arr[i];
                    j++;
                }
            }
            return answer;
        }
    }
}