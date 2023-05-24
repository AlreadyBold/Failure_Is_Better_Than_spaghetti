import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = num_list.length-1; i>=0; i--){
            arrayList.add(num_list[i]);
        }
        int[] answer = new int[arrayList.size()];
        int size=0;
        for(Integer temp : arrayList){
            answer[size++] = temp;
        }
        
        return answer;
    }
}