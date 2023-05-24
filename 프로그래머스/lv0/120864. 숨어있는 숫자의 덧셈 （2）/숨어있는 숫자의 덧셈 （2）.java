import java.util.regex.Pattern;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string += "A";
        String pattern = "^[0-9]*$";
        String plus = "";
        char[] arr = my_string.toCharArray();
        for(int i = 0 ; i < arr.length; i++ ) {
            if(Pattern.matches(pattern, Character.toString(arr[i]))) {
            	if(Pattern.matches(pattern, Character.toString(arr[i+1])) && i+1 <= arr.length) {
                    if(Pattern.matches(pattern, Character.toString(arr[i+2]))&& i+2 <= arr.length) {
                        plus = Character.toString(arr[i])+Character.toString(arr[i+1])+Character.toString(arr[i+2]);
                        answer = answer+ Integer.parseInt(plus);
                        plus = "";
                        i = i+2;
                    }else{
                    	plus = Character.toString(arr[i])+Character.toString(arr[i+1]);
                    	answer = answer + Integer.parseInt(plus);
                    	plus = "";
                    	i = i+1;
                    } 
            	}else { answer = answer + arr[i]-48;
                       
            	}
            }
        }
        return answer;
    }
}