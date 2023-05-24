import java.util.regex.Pattern;
class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        String pattern = "^[0-9]*$";
        
        if(Pattern.matches(pattern, s)){
            if(s.length()==4|| s.length()==6 ) {
                answer = true;
            }
        }
        return answer;
    }
}