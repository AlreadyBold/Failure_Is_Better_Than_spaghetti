import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList <Integer> array = new ArrayList();
        for ( int i = 0 ; i<arr.length; i++){
            if (arr[i] % divisor == 0 ){
                array.add(arr[i]);
            }
        }
        
        int[] answer = new int[array.size()];
        int size=0;
        for(int temp : array){
            answer[size++] = temp;
        }
        Arrays.sort(answer);
        return answer.length == 0 ? new int[] {-1} : answer;
    }
}