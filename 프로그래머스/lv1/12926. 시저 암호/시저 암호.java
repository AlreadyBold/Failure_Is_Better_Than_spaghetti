class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i =0; i<arr.length; i++) {
        	if( arr[i] > 96) {
        		arr[i] = (char) (arr[i]+n);
        		if(arr[i] > 122) {
        			arr[i] = (char) ((char) arr[i]-122+96);
        		} answer = answer+Character.toString(arr[i]);
        	} else if( arr[i] > 64 && arr[i] <91) {
        		arr[i] = (char) (arr[i]+n);
        		if(arr[i] > 90) {
        			arr[i] = (char) ((char) arr[i]-90+64);
        		} answer = answer+Character.toString(arr[i]);
        	} else if ( arr[i] == 32){
                answer = answer+" ";
            }
        	
        }
        return answer;
    }
}