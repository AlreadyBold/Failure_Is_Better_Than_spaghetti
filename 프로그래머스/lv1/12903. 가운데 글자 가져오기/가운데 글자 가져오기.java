class Solution {
   public String solution(String s) {
	        String answer = "";
	        int a = s.length() / 2;
	        int b = a-1;
	        if(s.length() % 2 == 0 ) { 
	        	char d = s.charAt(a);
	        	char c = s.charAt(b); 
	        	answer = Character.toString(c) + Character.toString(d); 
	        } else if (s.length() % 2 == 1) {
	        	char e = s.charAt(a);
	        	answer = (String) Character.toString(e);
	        }
			return answer;
	        
	    }
}