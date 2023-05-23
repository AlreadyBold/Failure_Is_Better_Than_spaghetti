import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numbers) {

    List<Integer> list = new ArrayList<>();
            for (int i=0; i<numbers.length; i++) {
                for(int j=i+1; j<numbers.length; j++){
                    list.add(numbers[i]+numbers[j]);
                }
            }
            Collections.sort(list);

            List<Integer> resultList = new ArrayList<Integer>();
            for (int i = 0; i < list.size(); i++) {
                if (!resultList.contains(list.get(i))) {
                    resultList.add(list.get(i));
                }
            }
            int a = resultList.size();
            
            int[] answer = new int[a];
            for(int i = 0; i<a; i++){
                answer[i] = resultList.get(i);
            };


        
        
        return answer;
    }
}