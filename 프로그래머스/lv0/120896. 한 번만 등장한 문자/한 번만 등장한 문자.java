import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        for(int i= 0 ; i<chars.length; i++ ){
            for(int j = i+1; j<=chars.length-1; j++){
                if(chars[i] == chars[j]){
                    chars[j] = '*';
                    count ++;
                }
            }                
            if(count > 0){
                chars[i] = '*';    
                }
            count = 0;
        }
        answer = new String(chars);
        String answerr ="";
        for(int i = 0 ; i <answer.length(); i++ ) {
        	if(!(answer.charAt(i) == '*')) {
        		answerr = answerr+answer.charAt(i);
        		
        	}
        }
        return answerr;
    }
}