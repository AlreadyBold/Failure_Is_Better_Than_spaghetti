import java.util.regex.Pattern;
import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String pattern = "^[0-9]*$";
	        for(int i = 0 ; i<babbling.length; i++ ){
	            babbling[i] = babbling[i].replace("aya","1");
	            babbling[i] = babbling[i].replace("ye","2") ;
	            babbling[i] = babbling[i].replace("woo","3");
	            babbling[i] = babbling[i].replace("ma","4");
	            char[]arr = babbling[i].toCharArray();
	            for(int j = 0; j<arr.length; j++){
	                if(j <arr.length-1 &&arr[j] == arr[j+1]) {
	                    break;
	                } else if(!(Pattern.matches(pattern, Character.toString(arr[j])))){
                        break;
                    } else if (j == arr.length-1){
                        answer++;
                        }
	                    
	                } 
	            }
	        
        return answer;
    }
}