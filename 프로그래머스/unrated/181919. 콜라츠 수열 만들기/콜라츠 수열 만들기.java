import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(n);
        for(int i = 0; i<1000; i++){
            if(n == 1) break;
            else if (n%2==0){
                n = n/2;
            } else {
                n= (n*3) + 1;
            }
            arr.add(n);
        }
        int[] answer = new int[arr.size()];
        for( int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}