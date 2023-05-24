import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> split = Arrays.asList(my_string.split(" "));
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.addAll(split);
        arrayList.removeAll(Arrays.asList("", null));
		
		String[] answer = arrayList.toArray(new String[arrayList.size()]);
        return answer;
    }
}