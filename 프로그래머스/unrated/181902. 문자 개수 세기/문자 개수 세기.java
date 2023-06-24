import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        Map <String, Integer> map = new HashMap<>();
        for(int i = 1; i<53; i++ ){
            if( i > 26 ){
                map.put(Character.toString(70+i),0);
            } else {
                map.put(Character.toString(64+i),0);
            }
        }
        for(int i = 0 ; i<my_string.length(); i++ ) {
            map.put(my_string.substring(i,i+1),
                    map.get(my_string.substring(i,i+1))+1);
        }
        int [] answer = new int[52];
        Iterator<String> keys = map.keySet().iterator();
        int i = 0;
        while( keys.hasNext() ){
            String key = keys.next();
            answer[i] = map.get(key);
            i++;
        }


        
        return answer;
    }
}