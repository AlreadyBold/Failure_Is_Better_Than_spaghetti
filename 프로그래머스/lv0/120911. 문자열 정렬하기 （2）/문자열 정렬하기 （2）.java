import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        
        char[] StringtoChar = my_string.toCharArray();
        Arrays.sort(StringtoChar);
        String SortedString = new String(StringtoChar);
        return SortedString;
    }
}