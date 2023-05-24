import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0 ; i<numlist.length; i++) {
            if ( numlist[i]%n == 0 ){
                a.add(numlist[i]);
            }
        }
        int[] answer = new int[a.size()];
        int size=0;
        for(Integer Integer : a){
            answer[size++] = Integer;
        }
        return answer;
    }
}