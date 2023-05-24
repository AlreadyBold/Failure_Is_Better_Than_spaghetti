import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.replace(" ","*");
        char [] arr = s.toCharArray();
        if(Character.toString(arr[0]).equals("*")) {
        	answer = "*";
        } else if (arr[0]>64) {
        	answer = Character.toString(arr[0]).toUpperCase();
        }
        for(int i = 1 ; i<arr.length; i++ ){
            if (Character.toString(arr[i-1]).equals("*")&& arr[i]>64){
                answer = answer+Character.toString(arr[i]).toUpperCase();
            } else if ((char)answer.charAt(i-1)<91 &&(char)answer.charAt(i-1)>64 && arr[i]>64 ) {
            	answer = answer+Character.toString(arr[i]).toLowerCase();
            } else if ((char)answer.charAt(i-1)>96 && arr[i]>64 ) {
            	answer = answer+Character.toString(arr[i]).toUpperCase();
            } else if (Character.toString(arr[i]).equals("*")){
                answer = answer+"*";
            }
        }
        return answer.replace("*", " ");
    }
}