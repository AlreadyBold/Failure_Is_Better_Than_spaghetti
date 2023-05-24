class Solution {
   public long solution(String my_string) {
	        long answer = 0;
	        String[] arr = my_string.split(" ");
            answer = Integer.parseInt(arr[0]);
	        for(int i = 1 ; i<arr.length; i++){
	        	
	            if(arr[i].equals("+")){

	            } else if (arr[i].equals("-")) {
	            	answer = answer - Long.parseLong(arr[i+1])*2;

	            } else {
                    answer = answer + Long.parseLong(arr[i]);

                }

	        }
	        return answer;
	    }
	
}