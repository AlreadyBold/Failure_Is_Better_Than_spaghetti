class Solution {
    public String solution(String my_string) {
      String answer = "";
		    char [] arr = {};
		    arr = my_string.toCharArray();
		    for(int i = 0 ; i<arr.length; i++ ) {
		        if(arr[i]<91) {
		        	arr[i] = (char) (arr[i]+32);
		        } else if (arr[i]>96){
	                arr[i] = (char) (arr[i]-32);
	            }
		    }

		        return String.valueOf(arr);
    }
}