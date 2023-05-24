import java.util.*;
class Solution {
  public Integer[] solution(int n) {
	        TreeSet<Integer> set = new TreeSet<Integer>();
		        for(int i = 2; i<=n; i++) {
		        	if(n%i == 0 ) {
		        		set.add(i);
		        		n = n/i;
		        		i = 1;
		        	}
	                if(n == 1) break;
		        }
		        
		        
		        Integer[] answer = set.toArray(new Integer[0]);
		        
		        return answer;
		    }
}