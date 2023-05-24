class Solution {
    public int solution(int[] array) {
        int answer = 0;
	    char [] b = {};
	    String a = "";
	    for(int i = 0 ; i <array.length; i++ ) {
	        a = Integer.toString(array[i]);
	        b = a.toCharArray();
	            for(int j = 0; j < b.length; j++ ) {
	            	if (b[j] == '7') {
	            		answer++;
	            	}
	            }
	            a = "";
	        }
	        System.out.println(a);
	        return answer;
	    }
}