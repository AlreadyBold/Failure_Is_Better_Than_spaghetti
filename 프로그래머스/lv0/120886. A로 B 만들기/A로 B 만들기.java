import java.util.*;
class Solution {
    public int solution(String before, String after) {
int answer = 1;
        char[] arr = before.toCharArray();
        char[] arrr = after.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arrr);
        for(int i=0; i<before.length(); i++) {
        	if(!(arr[i] == arrr[i])) {
        		answer = 0;
        		break;
        	}
        }
        
       return answer ; 
    
    }
}