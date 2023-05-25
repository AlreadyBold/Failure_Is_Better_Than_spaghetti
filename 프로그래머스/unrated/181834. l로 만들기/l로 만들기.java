class Solution {
    public String solution(String myString) {
        String answer = "";
	    int mySlen = myString.length();
	    for(int i = 0 ; i<mySlen; i++ ){
	        if (myString.charAt(i) < 108) {
	            answer = answer + 'l';
	        } else {
	            answer = answer + Character.toString(myString.charAt(i)); 
	        }
	    }
        return answer;
    }
}