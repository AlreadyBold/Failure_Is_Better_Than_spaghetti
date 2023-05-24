import java.util.*;
class Solution {
    public int[] solution(String my_string) {
		String a ="^[0-9]+$";
        String num = "";

        for(int i = 0; i<my_string.length(); i++){
            if(String.valueOf(my_string.charAt(i)).matches(a)) {
            	num = num+String.valueOf(my_string.charAt(i));
            }
        }
        char[] charArr = num.toCharArray(); 
        Arrays.sort(charArr);
        System.out.println(charArr);
        int[] answer = new int [charArr.length];
        for(int i= 0; i<charArr.length; i++) {
        	answer[i] = charArr[i]-48;
        }
        


        return answer;
    }
}