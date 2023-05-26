import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arr1 = new ArrayList();
        
        for( int i=0; i<strArr.length; i++ ){
            if( ! ( strArr[i].contains("ad") ) ){
                arr1.add(strArr[i]);
            }
        }
        
        String[] answer =  arr1.toArray(new String[arr1.size()]);
        
        return answer;
    }
}