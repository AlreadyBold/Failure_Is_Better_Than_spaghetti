import java.util.*;
import java.util.regex.Pattern;
class Solution {
    public String solution(String s) {
        String num = "^[0-9]*$";
		String answer = "";
        s = s.replace(" ","*");
        char [] arr = s.toCharArray();
        if(Pattern.matches(num, Character.toString(arr[0]))) {
            answer = Character.toString(arr[0]);
        }else if(Character.toString(arr[0]).equals("*")){
            answer = " ";
        }else if(arr[0]>64){
            answer = Character.toString(arr[0]).toUpperCase();
        }
        for(int i=1; i<arr.length; i++){
            if(Pattern.matches(num, Character.toString(arr[i]))) {
            	answer = answer+Character.toString(arr[i]);
            }else if (Character.toString(arr[i-1]).equals("*") && Character.toString(arr[i]).equals("*")){
            	answer = answer+" ";
            } else if (Character.toString(arr[i-1]).equals("*") && arr[i]>64){
            	answer = answer+Character.toString(arr[i]).toUpperCase();
            } else if (arr[i-1] > 64 && arr[i] > 64) {
            	answer = answer+Character.toString(arr[i]).toLowerCase();
            } else if (Pattern.matches(num, Character.toString(arr[i-1]))&& arr[i]>64) {
            	answer = answer+Character.toString(arr[i]).toLowerCase();
            } else if (Character.toString(arr[i]).equals("*")) {
                answer = answer+" ";
            }
        }
        return answer;
    }
}