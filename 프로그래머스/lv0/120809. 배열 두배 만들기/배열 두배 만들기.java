import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> ans = new ArrayList();
    	for( int i = 0 ; i<numbers.length; i++) {
    		ans.add(i, numbers[i]*2);
    	}
        int[] answer = new int[ans.size()];
        int size=0;
        for(int temp : ans){
            answer[size++] = temp;
        }
        return answer;
    }
}