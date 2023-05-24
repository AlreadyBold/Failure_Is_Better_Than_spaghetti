import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> arr = new ArrayList();
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                arr.add(i);
            }
        }
        int[] answer = new int[arr.size()];
        int size=0;
        for(int temp : arr){
            answer[size++] = temp;
        }
        return answer;
    }
}