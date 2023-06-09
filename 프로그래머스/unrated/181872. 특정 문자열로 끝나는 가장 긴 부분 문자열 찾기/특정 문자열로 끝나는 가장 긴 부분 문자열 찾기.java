import java.util.*;
class Solution {
   public String solution(String myString, String pat) {
        String answer = "";
        int len = myString.length();
        int cnt = 0;
        int patlen = pat.length();
        for(int i = 0; i<len-patlen; i++){
            if(myString.substring(i, i+patlen).equals(pat)) {
            	cnt = i+patlen;
            }
        }
       if(patlen == 1 ){
           if(pat.equals(myString.substring(len-1))){
                answer = myString.substring(0,cnt+1);
            } else {
               answer = myString.substring(0,cnt);
           }
       } else {
        answer = myString.substring(0,cnt);
       }
        
        return answer;
    }
}