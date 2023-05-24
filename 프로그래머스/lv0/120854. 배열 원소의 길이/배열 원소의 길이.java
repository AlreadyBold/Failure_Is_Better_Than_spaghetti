import java.util.ArrayList;
class Solution {
    public int[] solution(String[] strlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i<strlist.length; i++){
            arrayList.add(strlist[i].length());
        }
        int[] answer = new int[arrayList.size()];
        int size=0;
        for(int temp : arrayList){
            answer[size++] = temp;
        }

        return answer;
    }
}