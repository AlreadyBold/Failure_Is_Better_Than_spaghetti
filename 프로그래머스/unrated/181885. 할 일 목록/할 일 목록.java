import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arraylist = new ArrayList<>();
        for( int i = 0 ; i<finished.length; i++ ){
            if ( finished[i] == false ) {
                arraylist.add(todo_list[i]);
            }  
        }
        
        String[] answer = arraylist.toArray(new String[arraylist.size()]);
        return answer;
    }
}