import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int cnt=0;
        Arrays.sort(indices);
        for(int i = 0; i<my_string.length(); i++ ) {
        	for(int j=0; j<indices.length; j++){
                if(i == indices[j]) {
                    break;
                } else if( j == indices.length-1 ){
                    answer = answer + Character.toString(my_string.charAt(i));
                }
            }
            
        }
        
        return answer;
	}
}