class Solution {
    public String solution(String my_string) {
        String answer = "";
	        char [] arr = my_string.toCharArray();
	        for(int i= 0 ; i<arr.length-1; i++) {
	            for(int j = i+1; j<arr.length; j++ ){
	                if (arr[i] == arr[j]){
	                    arr[j] = (char) (1);
	                }
	            }
	        }
            for(int i = 0 ; i<arr.length; i++) {
	        	if(arr[i]>57 || arr[i]==32) {
	        		answer=answer+String.valueOf(arr[i]);
	        	}
	        }        
            
            
	        return answer;
    }
}