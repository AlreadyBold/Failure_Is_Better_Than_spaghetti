import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr1 = new ArrayList();
        for(int i = 0; i<intStrs.length; i++ ){
            if ( (Integer.parseInt(intStrs[i].substring( s,l+s ) ) ) > k){
                arr1.add((Integer.parseInt(intStrs[i].substring( s,l+s ))) );
            }
        }
        int[] answer = new int[arr1.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arr1.get(i);
        }
        
        
        return answer;
    }
}