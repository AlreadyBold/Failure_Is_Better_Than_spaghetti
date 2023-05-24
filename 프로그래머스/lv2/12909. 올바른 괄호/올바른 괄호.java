class Solution {
    	boolean solution(String s) {
        boolean answer = true;
        int a = 0;
        for(int i = 0; i<s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		a++;
        	} else if(s.charAt(i) == ')') {
        		a--;
        	}
            if(a < 0 ) break; 
        }
        
         if (a == 0 && s.charAt(0) == '(' && s.charAt(s.length()-1) == ')') {
        	 return true;
        } else {
             return false;
         }
            
    }

}